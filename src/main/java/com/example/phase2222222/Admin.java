package com.example.phase2222222;

import java.util.Collections;

class Admin extends Person {



    Admin(String username, String password) {
        super(username, password);
    }
    void adding(Object object){
        if(object instanceof Customer){
            Library.getCustomers().add((Customer)object);

        }
        else if(object instanceof Category){
            Library.getCategories().add((Category)object);

            Collections.sort(Library.getCategories());

        }
        else if(object instanceof Musical_Record){
            Musical_Record mus = (Musical_Record)object;
            Library.getMusical_records().add(mus);
            for(int i=0;i<Library.getCategories().size();i++){
                if(mus.getCategoryO().getName().equals(Library.getCategories().get(i).getName())){
                    Library.getCategories().get(i).getMusical_records().add(mus);
                    Collections.sort(Library.getCategories().get(i).getMusical_records());
                    break;
                }

                Collections.sort(Library.getCategories().get(i).getMusical_records());
            }
            for(int i=0;i<Library.getArtists().size();i++){
                if(mus.getArtistO().getName().equals(Library.getArtists().get(i).getName())){
                    Library.getArtists().get(i).getMusical_records().add(mus);

                    break;
                }

            }
            Collections.sort(Library.getMusical_records());
            Collections.sort(Library.getArtists());
        }
        else if(object instanceof Artist){

            Library.getArtists().add((Artist) object);

            Collections.sort(Library.getArtists());
        }
    }


    void deleting (Object object){

        if(object instanceof Category){
            Category cat=((Category)object);
            for (int i = 0; i < Library.getCategories().size(); i++) {
                if (Library.getCategories().get(i).equals(cat)) {
                    for(int k=0;k<Library.getCategories().get(i).getMusical_records().size();k++){
                        deleting(Library.getCategories().get(i).getMusical_records().get(k));
                    }

                    Library.getCategories().remove(i);

                    break;
                }
            }
        }
        else if(object instanceof Musical_Record){
            Musical_Record mus = (Musical_Record)object;
            for (int i = 0; i < Library.getMusical_records().size(); i++) {
                if (Library.getMusical_records().get(i).equals(mus)) {
                    Library.getMusical_records().remove(i);
                    break;
                }
            }
        }
    }

}
package com.example.phase2222222;


abstract class Person  {

    protected String username;
    protected String password;

    protected Person(String username, String password) {
        this.username = username;
        this.password = password;
    }




    public boolean equals(Person p) {
        return this.username.equals(p.getUsername());
    }

    String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Username: " + this.username + '\n';
    }

    String getPassword() {
        return password;
    }





    Musical_Record searchingbymusicalrecord (String searchWord) {
        try{
            for (int i = 0; i < Library.getMusical_records().size(); i++) {
                if (searchWord.equals(Library.getMusical_records().get(i).getName())) {


                    return Library.getMusical_records().get(i);
                }
            }
            throw new Exception("Musical Record is not found");
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
        return null;
    }

    Category searchingbycategory(String searchWord) {

        for (int i = 0; i < Library.getCategories().size(); i++) {
            if (searchWord.equals(Library.getCategories().get(i).getName())) {

                return Library.getCategories().get(i);
            }
        }
        return null;
    }

    Artist searchingbyartist (String searchWord) {
        for(int i=0;i<Library.getArtists().size();i++)
        {
            if(searchWord.equals(Library.getArtists().get(i).getName()))
            {
                return Library.getArtists().get(i);
            }
        }
        return null;
    }



}




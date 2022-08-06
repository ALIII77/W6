package repository;

public class UserRepository {

    public void createTable(){
        String sql = "create table user (" +
                "id primary key , username varchar(40),nationalCode varchar (40),)";
    }
}

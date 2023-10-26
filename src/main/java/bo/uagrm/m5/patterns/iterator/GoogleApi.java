package bo.uagrm.m5.patterns.iterator;

public class GoogleApi implements Aggregate {

    public GoogleUser[] getGoogleUsers() {
        GoogleUser[] users = new GoogleUser[3];
        users[0] = new GoogleUser("roberto", "r@gmail.com");
        users[1] = new GoogleUser("luis", "l@gmail.com");
        users[2] = new GoogleUser("ana", "a@gmail.com");

        return users;
    }

    @Override
    public Iterator createIterator() {
        GoogleUser[] list = getGoogleUsers();
        return new IteratorArray(list);
    }
}

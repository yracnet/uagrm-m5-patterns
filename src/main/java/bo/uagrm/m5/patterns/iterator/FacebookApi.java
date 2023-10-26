package bo.uagrm.m5.patterns.iterator;

import java.util.List;

public class FacebookApi implements Aggregate {

    public List<FacebookUser> getFacebookUsers() {
        return List.of(new FacebookUser("juan", "link1"),
                new FacebookUser("carlos", "link2"));
    }

    @Override
    public Iterator createIterator() {
        List<FacebookUser> list = getFacebookUsers();
        return new IteratorCollection(list);
    }
}

package bo.uagrm.m5.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ShowUsersPanel {

    private List<Aggregate> aggregate = new ArrayList<>();

    public ShowUsersPanel() {
        GoogleApi googleApi = new GoogleApi();
        FacebookApi facebookApi = new FacebookApi();
        aggregate.add(googleApi);
        aggregate.add(facebookApi);
    }

    public void show() {
        for (Aggregate aggregate : aggregate) {
            Iterator iter = aggregate.createIterator();
            while(!iter.isDone()){
                Object item = iter.next();
            System.out.println(item);
            }
        }
        
//        var users = this.googleApi.getGoogleUsers();
//        for (var i = 0; i < users.length; i++) {
//            System.out.println(users[i]);
//        }
//
//        var fbUsers = this.facebookApi.getFacebookUsers();
//        for (var i = 0; i < fbUsers.size(); i++) {
//            System.out.println(fbUsers.get(i));
//        }
    }
}

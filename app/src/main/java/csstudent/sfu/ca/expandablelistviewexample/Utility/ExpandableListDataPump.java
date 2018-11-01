package csstudent.sfu.ca.expandablelistviewexample.Utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by baesubin on 2018-11-01.
 */

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Strawberry");

        List<String> sports = new ArrayList<String>();
        sports.add("Soccer");
        sports.add("Baseball");
        sports.add("Basketball");

        expandableListDetail.put("Fruits", fruits);
        expandableListDetail.put("Sports", sports);

        return expandableListDetail;
    }
}

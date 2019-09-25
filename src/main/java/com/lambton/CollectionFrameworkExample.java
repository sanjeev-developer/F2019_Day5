package com.lambton;

import java.util.*;

public class CollectionFrameworkExample {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();//Creating arraylist
        list.add("123");//Adding object in arraylist
        list.add("456");
        list.add("789");
        list.add("741");
        //Invoking arraylist object
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        ////hashmap


        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        ArrayList<String> india = new ArrayList<String>();//Creating arraylist\
        india.add("goa");
        india.add("delhi");

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("india", "Washington DC");

        System.out.println(capitalCities);

        // 1. ArrayList
        //arrayFunc();

        // 2.
        //setFunc();

        // 3.
        //mapFunc();

        // 4.
        exe1Func();

//        int n = 3;
//        int value = (int) (((Math.pow(2, n)) * n) + 1);
//
//        System.out.println(value + "Nitin");

    }

    // 1.
    public static void arrayFunc() {
        ArrayList<String> mStringArrayList = new ArrayList<>();

        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("C");

        mStringArrayList.add("A");
        mStringArrayList.add("A");

        System.out.printf(String.valueOf(mStringArrayList) + "\n");

        /* For Loop for iterating ArrayList */
        System.out.println("For Loop:----------->");
        for (int counter = 0; counter < mStringArrayList.size(); counter++) {
            System.out.println(mStringArrayList.get(counter));
        }

        /* Advanced For Loop*/
        System.out.println("Advanced For Loop:----------->");
        for (String num : mStringArrayList) {
            System.out.println(num);
        }

        /* While Loop for iterating ArrayList*/
        System.out.println("While Loop");
        int count = 0;
        while (mStringArrayList.size() > count) {
            System.out.println(mStringArrayList.get(count));
            count++;
        }

        /*Looping Array List using Iterator can't update the list*/
        System.out.println("Iterator");
        Iterator iter = mStringArrayList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    // 2.
    public static void setFunc() {
        Set<String> mysSet = new HashSet<>();

        mysSet.add("India");
        mysSet.add("USA");
        mysSet.add("India");

        System.out.printf(String.valueOf(mysSet));
    }

    // 3.
    public static void mapFunc() {
        Map<String, ArrayList<String>> strMap = new HashMap<>();

        ArrayList<String> mIndArrayList = new ArrayList<>();

        mIndArrayList.add("Himachal");
        mIndArrayList.add("Punjab");
        mIndArrayList.add("Bengal");

        strMap.put("India", mIndArrayList);

        ///-------

        ArrayList<String> mUSArrayList = new ArrayList<>();
        mUSArrayList.add("New Jersy");
        mUSArrayList.add("Texas");
        mUSArrayList.add("California");
        mUSArrayList.add("Alaska");

        strMap.put("USA", mUSArrayList);

        ///-------

        ArrayList<String> mCandrrayList = new ArrayList<>();
        mCandrrayList.add("Ontario");
        mCandrrayList.add("British Columbia");
        mCandrrayList.add("Qubec");

        strMap.put("Canada", mCandrrayList);


        System.out.printf(String.valueOf(strMap));

    }


    // 4.
    public static void exe1Func() {

        ArrayList<String> mStringArrayList = new ArrayList<>();

        mStringArrayList.add("abc");
        mStringArrayList.add("Cab");
        mStringArrayList.add("Cat");
        mStringArrayList.add("mate");
        mStringArrayList.add("Atem");
        mStringArrayList.add("bac");
        mStringArrayList.add("Tac");
        mStringArrayList.add("atc");
        mStringArrayList.add("Pop");
        mStringArrayList.add("pat");
        mStringArrayList.add("123");
        mStringArrayList.add("231");
        mStringArrayList.add("431");

        System.out.printf(String.valueOf(mStringArrayList) + "\n");
        //
        ArrayList<String> dupArrayLsit = new ArrayList<>();
        for (int i = 0; i < mStringArrayList.size(); i++) {
            //
            ArrayList<String> newArrayList = new ArrayList<>();
            for (int j = 0; j < mStringArrayList.size(); j++) {

                if (compStrings(mStringArrayList.get(i), mStringArrayList.get(j))) {
                    newArrayList.add(mStringArrayList.get(j));
                }
            }

            if (dupArrayLsit.equals(newArrayList)) {

            } else {
                // india jugad to resolve bug
                if (newArrayList.size() == 0) {
                    newArrayList.add(mStringArrayList.get(i));
                    System.out.printf(String.valueOf(newArrayList) + "\n");
                } else {
                    System.out.printf(String.valueOf(newArrayList) + "\n");
                }

            }

            dupArrayLsit = newArrayList;
        }

    }

    public static Boolean compStrings(String var1, String var2) {
        /* check 1.
         * Used to check the Length
         *  */
        if (var1.length() != var2.length()) {
            return false;
        }
        /* check 2.
         * Used to check the Characters
         *  */
        int c = 0;
        char[] charArray1 = var1.toCharArray();
        char[] charArray2 = var2.toCharArray();
        //
        for (int i = 0; i < charArray1.length; i++) {
            //
            for (int j = 0; j < charArray2.length; j++) {

                char str = charArray1[i];
                if (Character.toLowerCase(charArray1[i]) == Character.toLowerCase(charArray2[j])) {
                    c++;
                }
            }
        }

        if (c == charArray1.length) {
            return true;
        } else {
            return false;
        }

    }

}
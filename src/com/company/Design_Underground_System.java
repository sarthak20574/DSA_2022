package com.company;

import java.util.HashMap;
import java.util.Map;

public class Design_Underground_System {

    //1396. Design Underground System
    //https://leetcode.com/problems/design-underground-system/
    class UndergroundSystem {
        Map<Integer, Arrivals> arrivalsMap;
        Map<String, TableOfAverages> tableOfAveragesMap;

        public UndergroundSystem() {

            arrivalsMap = new HashMap<>();
            tableOfAveragesMap = new HashMap<>();

        }

        public void checkIn(int id, String stationName, int t) {
            arrivalsMap.put(id, new Arrivals(id, stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            String start_end = arrivalsMap.get(id).startingPoint + " " + stationName;
            int time = t - arrivalsMap.get(id).t;
            if (tableOfAveragesMap.containsKey(start_end)) {
                tableOfAveragesMap.get(start_end).update(time);
            } else {
                tableOfAveragesMap.put(start_end, new TableOfAverages(start_end, time));
            }
            arrivalsMap.remove(id);
        }

        public double getAverageTime(String startStation, String endStation) {
            return tableOfAveragesMap.get(startStation + " " + endStation).average();
        }

        class Arrivals {
            int id_of_passenger;
            String startingPoint;
            int t;

            Arrivals(int id, String startingPoint, int t) {
                this.id_of_passenger = id;
                this.startingPoint = startingPoint;
                this.t = t;
            }

        }

        class TableOfAverages {
            String name;
            int count;
            int sum;

            TableOfAverages(String name, int time) {
                this.name = name;
                count = 1;
                sum = time;
            }

            double average() {
                return (double) sum / count;
            }

            void update(int time) {
                sum += time;
                count++;
            }
        }
    }

}

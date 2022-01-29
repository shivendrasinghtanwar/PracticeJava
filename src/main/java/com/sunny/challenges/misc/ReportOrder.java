package com.sunny.challenges.misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class ReportOrder {
    public static void main(String[] args) {


        ArrayList<Report> reqList = new ArrayList<Report>();

        reqList.add(new Report(1, new int[]{3, 4}));
        reqList.add(new Report(2, new int[]{}));
        reqList.add(new Report(3, new int[]{2}));
        reqList.add(new Report(4, new int[]{2}));
        reqList.add(new Report(5, new int[]{}));
        reqList.add(new Report(6, new int[]{2,4}));
        reqList.add(new Report(7, new int[]{1,9,12,14}));
        reqList.add(new Report(8, new int[]{6,5,4,1,2,3}));
        reqList.add(new Report(9, new int[]{5}));
        reqList.add(new Report(10, new int[]{4,5,6}));
        reqList.add(new Report(11, new int[]{8,13,14,15}));
        reqList.add(new Report(12, new int[]{5,1,6}));
        reqList.add(new Report(13, new int[]{1,2,3}));
        reqList.add(new Report(14, new int[]{8,9,13,11,10,5,6,4}));
        reqList.add(new Report(15, new int[]{2,5,6,8,9}));

        reqList.sort(Comparator.comparingInt((Report r) -> r.dependencies.length));

        System.out.println("Req List:");
        for (Report report : reqList) System.out.println(report.toString());
        System.out.println();

        ArrayList<Integer> ans = new ArrayList<>();

        printOrder(reqList, ans);

        System.out.print("Result : ");
        System.out.println(ans);
    }


    static void printOrder(ArrayList<Report> reqList, ArrayList<Integer> ans){

        for (Report report : reqList) {
            if(!ans.contains(report.id))
                print(reqList, report, ans);
        }
    }

    static void print(ArrayList<Report> reqList, Report r, ArrayList<Integer> ans){

        for (int dependentReportId : r.dependencies) {
            if(!ans.contains(dependentReportId)) print(reqList, reqList.get(dependentReportId-1), ans);
        }

        if(!ans.contains(r.id)) {
//            System.out.println("Id: "+r.id);
            ans.add(r.id);
        }

    }
}

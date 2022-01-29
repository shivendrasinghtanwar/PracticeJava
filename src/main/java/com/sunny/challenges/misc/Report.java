package com.sunny.challenges.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Report {

    int id = 0;

    int[] dependencies;

    public Report(int id, int[] dependencies) {
        this.id = id;
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", dependencies=" + Arrays.toString(dependencies) +
                '}';
    }
}

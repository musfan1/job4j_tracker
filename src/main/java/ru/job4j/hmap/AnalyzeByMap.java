package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0D;
        int amount = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                amount += 1;
            }
        }
        return amount > 0 ? rsl / amount : rsl;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double rsl = 0D;
            int amount = 0;
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                amount += 1;
            }
            result.add(new Label(pupil.name(), amount > 0 ? rsl / amount : rsl));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new HashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!map.containsKey(subject.name())) {
                    map.put(subject.name(), subject.score());
                } else {
                    map.replace(subject.name(), map.get(subject.name()) + subject.score());
                }
            }
        }
        for (String subjectName : map.keySet()) {
            result.add(new Label(subjectName, pupils.size() > 0 ? (double) map.get(subjectName) / pupils.size() : 0D));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double rsl = 0D;
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
            }
            result.add(new Label(pupil.name(), rsl));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new HashMap<>();
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!map.containsKey(subject.name())) {
                    map.put(subject.name(), subject.score());
                } else {
                    map.replace(subject.name(), map.get(subject.name()) + subject.score());
                }
            }
        }
        for (String subjectName : map.keySet()) {
            result.add(new Label(subjectName, map.get(subjectName)));
        }
        result.sort(Comparator.naturalOrder());
        return result.get(result.size() - 1);
    }
}
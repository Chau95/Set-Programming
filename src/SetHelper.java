/**
 * Created by Chau Duong on 1/22/2015.
 */

import java.util.*;

public class SetHelper<E> {
    public Set<E> intersect(Set<E> s1, Set<E> s2){
        Set<E> intersection = new HashSet<E>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public Set<E> union (Set<E> s1, Set<E> s2){
        Set<E> intersection = new HashSet<E>(s1);
        intersection.retainAll(s2);
        return intersection;
    }

    public Set<E> differences (Set<E> s1, Set<E> s2){
        Set<E> differences = new HashSet<E>(s1);
        differences.removeAll(s2);
        return differences;
    }

    public Set<E> symmetricDifferences (Set<E> s1, Set<E> s2){
        Set<E> unionS1andS2 = union(s1, s2);
        Set<E> differencesS1andS2 = differences(s1, s2);
        Set<E> sDiffS1andS2 = differences (unionS1andS2, differencesS1andS2);
        return sDiffS1andS2;
    }
}
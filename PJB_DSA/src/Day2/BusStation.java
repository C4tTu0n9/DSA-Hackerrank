package Day2;

import java.util.*;

public class BusStation {

    public static List<Integer> solve(List<Integer> a) {
        int people = 0;
        List<Integer> sum = new ArrayList<>();

        for (int group : a) {
            people += group;
            sum.add(people);
        }

        // gcd cua prefixS
        int gcd = sum.get(0);
        for (int i = 1; i < sum.size(); i++) {
            gcd = getGCD(gcd, sum.get(i));
        }

        // divisors cua totalP
        List<Integer> divs = getDivisors(people);

        // Loc values
        List<Integer> validCapacities = new ArrayList<>();
        for (int div : divs) {
            if (div >= gcd && isValidCapacity(a, div)) {
                validCapacities.add(div);
            }
        }

        return validCapacities;
    }

    private static int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }

    private static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    private static boolean isValidCapacity(List<Integer> groups, int capacity) {
        int currentLoad = 0;
        for (int group : groups) {
            if (currentLoad + group > capacity) {
                if (currentLoad != capacity) return false;
                currentLoad = 0;
            }
            currentLoad += group;
        }
        return currentLoad == capacity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true) {
            if (check) {
                System.out.println("Number groups: ");
                int groupNum = sc.nextInt();
                System.out.println("Group input: ");
                List<Integer> groups = new ArrayList<>();
                for (int i = 0; i < groupNum; i++) {
                    groups.add(sc.nextInt());
                }
                List<Integer> result = solve(groups);
                System.out.println(result);
            }
            System.out.println("Continue? (Y/N)");
            String input = sc.next();
            if (input.equalsIgnoreCase("y")) {
                check = true;
                continue;
            } else if (input.equalsIgnoreCase("n")) {
                check = false;
                break;
            } else {
                System.out.println("Wrong input");
                check = false;
            }
        }

    }
}

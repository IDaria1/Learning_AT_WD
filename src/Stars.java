public class Stars {
        public static void main(String[] args) {
            st1();
            st2();
            st3();
            st4();
            st5();
            st6();
            st7();
            st8();
            st9();
            st10();
            st11();
        }

        public static void st1() {
            int s = 10;
            for (int i = 0; i <= s; i++) {
                String emp = "";
                for (int j = 0; j <= s; j++) {
                    if (i >= j) {
                        emp += "";
                    } else {
                        emp += "* ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st2() {
            int s = 10;
            for (int i = 0; i <= s; i++) {
                String emp = "";
                for (int j = 0; j <= s; j++) {
                    if (i <= j) {
                        emp += "";
                    } else {
                        emp += "* ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st3() {
            int p = 10;
            for (int i = 0; i < p; i++) {
                String emp = "";
                for (int j = 0; j < p; j++) {
                    if (i == j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st4() {
            int p = 10;
            for (int i = 10; i >= 0; i--) {
                String emp = "";
                for (int j = 0; j < p; j++) {
                    if (i == j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st5() {
            int p = 10;
            for (int i = 10; i >= 0; i--) {
                String emp = "";
                for (int j = 0; j <= p; j++) {
                    if (i <= j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st6() {
            for (int i = 10; i >= 0; i--) {
                String emp = "";
                for (int j = 10; j >= 0; j--) {
                    if (i >= j) {
                        emp += "* ";
                    } else {
                        emp += "  ";
                    }
                }
                System.out.println(emp);
            }
        }

        public static void st7() {
            int p = 10;
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < p; j++) {
                    System.out.print("* ");
                }
                System.out.println("  ");
            }
        }

    public static void st8() {
        int n = 9; // Adjusted to make the pattern symmetric
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 ||
                    (i == 2 && j > 1 && j < n - 2) || (i == n - 3 && j > 1 && j < n - 2) ||
                    (j == 2 && i > 1 && i < n - 2) || (j == n - 3 && i > 1 && i < n - 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void st9() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void st10() {
        int n = 10;
        int m = n / 2;
        for (int i = -m; i <= m; i++) {
            for (int j = -m; j <= m; j++) {
                if (Math.abs(i) + Math.abs(j) <= m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void st11() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i <= n - j - 1 || i >= j && i >= n - j - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
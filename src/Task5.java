import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ���� ��������: ");
        int d = sc.nextInt();
        Scanner scn = new Scanner(System.in);
        System.out.println("������� ����� ��������: ");
        byte m = sc.nextByte();
        Scanner scnn = new Scanner(System.in);
        System.out.println("������� ��� ��������: ");
        int g = sc.nextInt();

        switch (m){
            case (3): {
                if (d >= 21 && d < 32) {
                    System.out.println("���� �������: ����");
                } else {
                    System.out.println("���� �������: ����");
                }
                break;
            }
            case (4): {
                if (d >= 21 && d < 31) {
                    System.out.println("���� �������: �����");
                } else {
                    System.out.println("���� �������: ����");
                }
                break;
            }
            case (5): {
                if (d >= 22 && d < 32) {
                    System.out.println("���� �������: ��������");
                } else {
                    System.out.println("���� �������: �����");
                }
                break;
            }
            case (6): {
                if (d >= 22 && d < 31) {
                    System.out.println("���� �������: ���");
                } else {
                    System.out.println("���� �������: ��������");
                }
                break;
                }
            case (7): {
                if (d >= 24 && d < 32) {
                    System.out.println("���� �������: ���");
                } else {
                    System.out.println("���� �������: ���");
                }
                break;
            }
            case (8): {
                if (d >= 24 && d < 32) {
                    System.out.println("���� �������: ����");
                } else {
                    System.out.println("���� �������: ���");
                }
                break;
            }
            case (9): {
                if (d >= 24 && d < 31) {
                    System.out.println("���� �������: ����");
                } else {
                    System.out.println("���� �������: ����");
                }
                break;
            }
            case (10): {
                if (d >= 24 && d < 32) {
                    System.out.println("���� �������: ��������");
                } else {
                    System.out.println("���� �������: ����");
                }
                break;
            }
            case (11): {
                if (d >= 23 && d < 31) {
                    System.out.println("���� �������: �������");
                } else {
                    System.out.println("���� �������: ��������");
                }
                break;
            }
            case (12): {
                if (d >= 22 && d < 32) {
                    System.out.println("���� �������: �������");
                } else {
                    System.out.println("���� �������: �������");
                }
                break;
            }
            case (1): {
                if (d >= 21 && d < 32) {
                    System.out.println("���� �������: �������");
                } else {
                    System.out.println("���� �������: �������");
                }
                break;
            }
            case (2): {
                if (d >= 20 && d < 32) {
                    System.out.println("���� �������: ����");
                } else {
                    System.out.println("���� �������: �������");
                }
                break;
            }
        }
        switch (g) {
            case (1920), (1932), (1944), (1956), (1968), (1980), (1992), (2004), (2016) -> {
                System.out.println("���: ��������");
                break;
            }
            case (1921), (1933), (1945), (1957), (1969), (1981), (1993), (2005), (2017) -> {
                System.out.println("���: �����");
                break;
            }
            case (1922), (1934), (1946), (1958), (1970), (1982), (1994), (2006), (2018) -> {
                System.out.println("���: ������");
                break;
            }
            case (1923), (1935), (1947), (1959), (1971), (1983), (1995), (2007), (2019) -> {
                System.out.println("���: ������");
                break;
            }
            case (1924), (1936), (1948), (1960), (1972), (1984), (1996), (2008), (2020) -> {
                System.out.println("���: �����");
                break;
            }
            case (1925), (1937), (1949), (1961), (1973), (1985), (1997), (2009), (2021) -> {
                System.out.println("���: ���");
                break;
            }
            case (1926), (1938), (1950), (1962), (1974), (1986), (1998), (2010), (2022) -> {
                System.out.println("���: ����");
                break;
            }
            case (1927), (1939), (1951), (1963), (1975), (1987), (1999), (2011), (2023) -> {
                System.out.println("���: ����(�������)");
                break;
            }
            case (1928), (1940), (1952), (1964), (1976), (1988), (2000), (2012), (2024) -> {
                System.out.println("���: �������");
                break;
            }
            case (1929), (1941), (1953), (1965), (1977), (1989), (2001), (2013), (2025) -> {
                System.out.println("���: ����");
                break;
            }
            case (1930), (1942), (1954), (1966), (1978), (1990), (2002), (2014), (2026) -> {
                System.out.println("���: ������");
                break;
            }
            case (1931), (1943), (1955), (1967), (1979), (1991), (2003), (2015), (2027) -> {
                System.out.println("���: ����(����)");
                break;
            }
        }
    }
}
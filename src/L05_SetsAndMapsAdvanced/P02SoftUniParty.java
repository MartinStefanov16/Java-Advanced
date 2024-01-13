package L05_SetsAndMapsAdvanced;

import java.util.*;

import static java.lang.System.in;

public class P02SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        TreeSet<String> invitedGuests = new TreeSet<>();

        String guestName = scanner.nextLine();

        while (!guestName.equals("PARTY")){

            invitedGuests.add(guestName);
            guestName = scanner.nextLine();
        }

        String attendedGuest = scanner.nextLine();

        while (!attendedGuest.equals("END")){
            invitedGuests.remove(attendedGuest);

            attendedGuest = scanner.nextLine();
        }

        System.out.println(invitedGuests.size());

        for (String guest : invitedGuests) {
            System.out.println(guest);
        }

    }
}

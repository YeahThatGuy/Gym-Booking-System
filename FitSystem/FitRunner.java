import java.util.*;

public class FitRunner
{
    public static void main (String[] args) {
        
        /**
         * This Map helps group the reviews by FitnessClass. All the reviews pertaining
         * to a specific FitnessClass are kept in a single cell and in Review type 
         * ArrayList. This makes it elegant to retrieve the specific reviews for that
         * class and time later on.
         */
        Map<FitnessClass,ArrayList<Review>> myMap = new HashMap<FitnessClass,ArrayList<Review>>();
        ArrayList<Review> reviewsList = new ArrayList<Review>();

        /**
         * Add fitness classes here
         */
        FitnessClass fitClass1A = new FitnessClass("Zumba", "Saturday/10", 20, 10);
        FitnessClass fitClass1B = new FitnessClass("Zumba", "Saturday/13", 20, 10);
        FitnessClass fitClass1C = new FitnessClass("Zumba", "Saturday/17", 20, 10);
        FitnessClass fitClass1D = new FitnessClass("Zumba", "Saturday/18", 20, 10);
        FitnessClass fitClass2A = new FitnessClass("Yoga", "Saturday/9", 20, 12);
        FitnessClass fitClass2B = new FitnessClass("Yoga", "Saturday/15", 20, 12);
        FitnessClass fitClass2C = new FitnessClass("Yoga", "Saturday/19", 20, 12);
        FitnessClass fitClass2D = new FitnessClass("Yoga", "Saturday/20", 20, 12);
        FitnessClass fitClass3A = new FitnessClass("Cardio", "Saturday/11", 20, 14);
        FitnessClass fitClass3B = new FitnessClass("Cardio", "Saturday/14", 20, 14);
        FitnessClass fitClass3C = new FitnessClass("Cardio", "Saturday/19", 20, 14);
        FitnessClass fitClass3D = new FitnessClass("Cardio", "Saturday/18", 20, 14);
        FitnessClass fitClass4A = new FitnessClass("Pilates", "Sunday/10", 20, 15);
        FitnessClass fitClass4B = new FitnessClass("Pilates", "Sunday/14", 20, 15);
        FitnessClass fitClass4C = new FitnessClass("Pilates", "Sunday/18", 20, 15);
        FitnessClass fitClass4D = new FitnessClass("Pilates", "Sunday/19", 20, 15);
        FitnessClass fitClass5A = new FitnessClass("Bodybuilding", "Sunday/11", 20, 8);
        FitnessClass fitClass5B = new FitnessClass("Bodybuilding", "Sunday/15", 20, 8);
        FitnessClass fitClass5C = new FitnessClass("Bodybuilding", "Sunday/17", 20, 8);
        FitnessClass fitClass5D = new FitnessClass("Bodybuilding", "Sunday/20", 20, 8);

        ArrayList<FitnessClass> fitArr = new ArrayList<FitnessClass>();
        fitArr.add(fitClass1A);
        fitArr.add(fitClass1B);
        fitArr.add(fitClass1C);
        fitArr.add(fitClass1D);
        fitArr.add(fitClass2A);
        fitArr.add(fitClass2B);
        fitArr.add(fitClass2C);
        fitArr.add(fitClass2D);
        fitArr.add(fitClass3A);
        fitArr.add(fitClass3B);
        fitArr.add(fitClass3C);
        fitArr.add(fitClass3D);
        fitArr.add(fitClass4A);
        fitArr.add(fitClass4B);
        fitArr.add(fitClass4C);
        fitArr.add(fitClass4D);
        fitArr.add(fitClass5A);
        fitArr.add(fitClass5B);
        fitArr.add(fitClass5C);
        fitArr.add(fitClass5D);

        /**
         * Add users here
         */
        Member user1 = new Member("John Doe");
        Member user2 = new Member("Pat Jenkins");
        Member user3 = new Member("Bob Saget");
        Member user4 = new Member("Sam Dust");
        Member user5 = new Member("Nick Fuori");
        Member user6 = new Member("Chris Buck");
        Member user7 = new Member("Daniela Bailey");
        Member user8 = new Member("Nancy Stewarts");
        Member user9 = new Member("Adriana Ramirez");
        Member user10 = new Member("Eliah Lost");
        Member user11 = new Member("Jason Thunder");
        Member user12 = new Member("Eliza Sparrow");
        Member user13 = new Member("Ingrid Flies");
        Member user14 = new Member("Constantine Dereck");
        Member user15 = new Member("Jessica Bright");
        
        /**
         * Register for specific class and time
         */
        fitClass1A.registerNewMemberCash(user1);
        fitClass1A.registerNewMemberCash(user2);
        fitClass1B.registerNewMemberCash(user3);
        fitClass2A.registerNewMemberCard(user1, "4092-8992-2322-7821", "20-40-76");
        fitClass1B.registerNewMemberCash(user4);
        fitClass1B.registerNewMemberCash(user5);
        fitClass1C.registerNewMemberCash(user6);
        fitClass1D.registerNewMemberCash(user7);
        fitClass2A.registerNewMemberCash(user8);
        fitClass2A.registerNewMemberCash(user9);
        fitClass2B.registerNewMemberCash(user10);
        fitClass2B.registerNewMemberCash(user11);
        fitClass2C.registerNewMemberCash(user12);
        fitClass2D.registerNewMemberCash(user13);
        fitClass3A.registerNewMemberCash(user14);
        fitClass3B.registerNewMemberCard(user15, "4285-2241-0832-9723", "72-44-93");
        fitClass3B.registerNewMemberCash(user1);
        fitClass3C.registerNewMemberCash(user3);
        fitClass3C.registerNewMemberCash(user6);
        fitClass3C.registerNewMemberCash(user2);
        fitClass3C.registerNewMemberCash(user9);
        fitClass3D.registerNewMemberCash(user4);
        fitClass4A.registerNewMemberCash(user14);
        fitClass4A.registerNewMemberCash(user11);
        fitClass4A.registerNewMemberCard(user10, "4222-8672-1322-6240", "11-92-75");
        fitClass4B.registerNewMemberCash(user12);
        fitClass4B.registerNewMemberCash(user13);
        fitClass4C.registerNewMemberCash(user1);
        fitClass4C.registerNewMemberCash(user5);
        fitClass4D.registerNewMemberCash(user9);
        fitClass5A.registerNewMemberCard(user6, "3982-8212-0232-9021", "21-30-46");
        fitClass5A.registerNewMemberCash(user7);
        fitClass5A.registerNewMemberCash(user8);
        fitClass5B.registerNewMemberCash(user3);
        fitClass5C.registerNewMemberCash(user2);
        fitClass5C.registerNewMemberCash(user11);
        
        
        /**
         * Add reviews here
         */
        Review classReview = new Review(user12, fitClass2C, 3, "Enjoyable, but requires lots of effort");
        myMap.putIfAbsent(fitClass2C, new ArrayList<Review>());
        myMap.get(fitClass2C).add(classReview);
        fitClass2C.addRating(classReview);
        
        classReview = new Review(user1, fitClass4C, 4, "I like it, but heard that the tutors are better in the last timeslot");
        myMap.putIfAbsent(fitClass4C, new ArrayList<Review>());
        myMap.get(fitClass4C).add(classReview);
        fitClass4C.addRating(classReview);
        
        classReview = new Review(user13, fitClass2D, 4, "Great facilities and organisation");
        myMap.putIfAbsent(fitClass2D, new ArrayList<Review>());
        myMap.get(fitClass2D).add(classReview);
        fitClass2D.addRating(classReview);
        
        classReview = new Review(user14, fitClass3A, 2, "It's really hard");
        myMap.putIfAbsent(fitClass3A, new ArrayList<Review>());
        myMap.get(fitClass3A).add(classReview);
        fitClass3A.addRating(classReview);
        
        classReview = new Review(user15, fitClass3B, 5, "Beats being at the pub");
        myMap.putIfAbsent(fitClass3B, new ArrayList<Review>());
        myMap.get(fitClass3B).add(classReview);
        fitClass3B.addRating(classReview);
        
        classReview = new Review(user1, fitClass3B, 5, "Amazing!");
        myMap.putIfAbsent(fitClass3B, new ArrayList<Review>());
        myMap.get(fitClass3B).add(classReview);
        fitClass3B.addRating(classReview);
        
        classReview = new Review(user6, fitClass3C, 3, "Good enough for my needs");
        myMap.putIfAbsent(fitClass3C, new ArrayList<Review>());
        myMap.get(fitClass3C).add(classReview);
        fitClass3C.addRating(classReview);
        
        classReview = new Review(user7, fitClass1D, 5, "Will get you in shape in about 3 months");
        myMap.putIfAbsent(fitClass1D, new ArrayList<Review>());
        myMap.get(fitClass1D).add(classReview);
        fitClass1D.addRating(classReview);
        
        classReview = new Review(user6, fitClass1C, 4, "Splendid and efficient");
        myMap.putIfAbsent(fitClass1C, new ArrayList<Review>());
        myMap.get(fitClass1C).add(classReview);
        fitClass1C.addRating(classReview);
        
        classReview = new Review(user3, fitClass5B, 3, "Weird flex, but ok.");
        myMap.putIfAbsent(fitClass5B, new ArrayList<Review>());
        myMap.get(fitClass5B).add(classReview);
        fitClass5B.addRating(classReview);
        
        classReview = new Review(user8, fitClass5A, 5, "I've been wasting protein shakes until now.");
        myMap.putIfAbsent(fitClass5A, new ArrayList<Review>());
        myMap.get(fitClass5A).add(classReview);
        fitClass5A.addRating(classReview);
        
        classReview = new Review(user14, fitClass4A, 1, "The changing rooms were disgusting");
        myMap.putIfAbsent(fitClass4A, new ArrayList<Review>());
        myMap.get(fitClass4A).add(classReview);
        fitClass4A.addRating(classReview);
        
        classReview = new Review(user10, fitClass4A, 4, "Take it slow and enjoy a healthy lifestyle");
        myMap.putIfAbsent(fitClass4A, new ArrayList<Review>());
        myMap.get(fitClass4A).add(classReview);
        fitClass4A.addRating(classReview);
        
        classReview = new Review(user9, fitClass4D, 5, "Great unwinding at the end of the day");
        myMap.putIfAbsent(fitClass4D, new ArrayList<Review>());
        myMap.get(fitClass4D).add(classReview);
        fitClass4D.addRating(classReview);
        
        classReview = new Review(user6, fitClass5A, 3, "Everyone's a bit sleepy in the morning");
        myMap.putIfAbsent(fitClass5A, new ArrayList<Review>());
        myMap.get(fitClass5A).add(classReview);
        fitClass5A.addRating(classReview);
        
        classReview = new Review(user2, fitClass5C, 5, "I'm glad they have an evening slot");
        myMap.putIfAbsent(fitClass5C, new ArrayList<Review>());
        myMap.get(fitClass5C).add(classReview);
        fitClass5C.addRating(classReview);
        
        classReview = new Review(user11, fitClass5C, 4, "Doing work on my lats");
        myMap.putIfAbsent(fitClass5C, new ArrayList<Review>());
        myMap.get(fitClass5C).add(classReview);
        fitClass5C.addRating(classReview);
        
        classReview = new Review(user1, fitClass2A, 2, "Didn't break a sweat");
        myMap.putIfAbsent(fitClass2A, new ArrayList<Review>());
        myMap.get(fitClass2A).add(classReview);
        fitClass2A.addRating(classReview);

        classReview = new Review(user2, fitClass1A, 3, "Ok, but could be better");
        myMap.putIfAbsent(fitClass1A, new ArrayList<Review>());
        myMap.get(fitClass1A).add(classReview);
        fitClass1A.addRating(classReview);

        classReview = new Review(user3, fitClass1B, 4, "Good, just what I needed.");
        myMap.putIfAbsent(fitClass1B, new ArrayList<Review>());
        myMap.get(fitClass1B).add(classReview);
        fitClass1B.addRating(classReview);
        /**
         * Ask for user input
         */
        Scanner output = new Scanner(System.in);
        System.out.println("Welcome to our Fitness Centre. " + "\n" +
            "We run the following classes: " + fitArr.toString());

        Scanner input = new Scanner(System.in);

        System.out.println("Type 1 for \"Member app\" or 2 for \"Admin console\"");
        String answer = input.next();

        if (answer.equals("1")) {
            //Member app
            boolean classRegistrationLoop = true;
            do {
                System.out.println("\nWhich class do you want to inquire about: (type Q for none)");
                answer = input.next();

                for (FitnessClass i: fitArr) {
                    if (i.getClassName().equals(answer)) {
                        System.out.println("Current availability for " + i.getClassName() + 
                            " (" + i.getDateTime() + ") is: " + i.getAvailablePlaces());

                        System.out.println("Registered members: " + i.getTakenPlaces());
                        //display rating
                        System.out.println("Average rating: " + i.getAverageRating());
                        //display price
                        System.out.println("Price: £" + i.getFee());
                        //display reviews
                        System.out.println(myMap.get(i) + "\n");
                        
                    }
                    else if (answer.equals("Q")) {
                        break;
                    }
                }

                System.out.println("Do you want to register for " + answer + "? (type Y or N)");
                String classChoice = answer;
                answer = input.next();

                if (answer.equals("Y")) {
                    Member newUser = new Member();
                    System.out.println("What is your name: ");
                    String userName = input.next();
                    newUser.setName(userName);

                    System.out.println("Which date and time do you want? (example - Saturday/10)");
                    String dateAndTimeChoice = input.next();
                    for (FitnessClass i: fitArr) {
                        if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice)) {
                            if (i.getAvailablePlaces() > 0) {
                                if (!i.getMembersListText().contains(newUser.getName())) {
                                    System.out.println("You can register. There are " + i.getAvailablePlaces()
                                        + "/" + (i.getAvailablePlaces() + i.getTakenPlaces()) + " places left.");
                                }
                                else {
                                    System.out.println("You have already registered for this time and class.\n" +
                                        "Please select another one.");
                                    dateAndTimeChoice = input.next();
                                }
                            }
                            else {
                                System.out.println("No places left, please select another time");
                                dateAndTimeChoice = input.next();
                            }
                        }
                    }

                    System.out.println("How would you like to pay? (Cash or Card)");
                    String paymentAnswer = input.next();
                    String cardNumber = "";
                    String sortCode = "";
                    if (paymentAnswer.equals("Cash")) {
                        for (FitnessClass i: fitArr) {
                            if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice) && paymentAnswer.equals("Cash")) {
                                i.registerNewMemberCash(newUser);
                            }
                        }
                    } else if (paymentAnswer.equals("Card")) {
                        System.out.println("Please enter your card number: ");
                        cardNumber = input.next();
                        System.out.println("Please enter your sort code: ");
                        sortCode = input.next();
                        for (FitnessClass i: fitArr) {
                            if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice) && paymentAnswer.equals("Card")) {
                                i.registerNewMemberCard(newUser, cardNumber, sortCode);
                            }
                        }
                    }

                    System.out.println("Do you want to change the time for your class? (type Y or N)");
                    answer = input.next();
                    if (answer.equals("Y")) {
                        for (FitnessClass i: fitArr) {
                            if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice)) {
                                i.removeMember(newUser);
                            }
                        }
                        System.out.println("Which date and time do you want? (example - Saturday/10)");
                        dateAndTimeChoice = input.next();

                        for (FitnessClass i: fitArr) {
                            if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice)) {
                                if (i.getAvailablePlaces() > 0) {
                                    if (!i.getMembersListText().contains(newUser.getName())) {
                                        System.out.println("You can register. There are " + i.getAvailablePlaces()
                                            + "/" + (i.getAvailablePlaces() + i.getTakenPlaces()) + " places left.");
                                    }
                                    else {
                                        System.out.println("You have already registered for this time and class.\n" +
                                            "Please select another one.");
                                        dateAndTimeChoice = input.next();
                                    }
                                }
                                else {
                                    System.out.println("No places left, please select another time");
                                    dateAndTimeChoice = input.next();
                                }
                            }
                        }

                        if (paymentAnswer.equals("Cash")) {
                            for (FitnessClass i: fitArr) {
                                if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice) && paymentAnswer.equals("Cash")) {
                                    i.registerNewMemberCash(newUser);
                                }
                            }
                        } else if (paymentAnswer.equals("Card")) {

                            for (FitnessClass i: fitArr) {
                                if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice) && paymentAnswer.equals("Card")) {
                                    i.registerNewMemberCard(newUser, cardNumber, sortCode);
                                }
                            }
                        }
                    }
                    System.out.println("Do you want to leave a review? (type Y or N)");
                    answer = input.next();
                    if (answer.equals("Y")) {
                        System.out.println("Write your review: ");
                        String newReview = input.next();
                        int newRating;
                        //validation
                        do {
                            System.out.println("Please rate your class, from worst to best: (1-5)");
                            while (!input.hasNextInt()) {
                                System.out.println("Please enter a number!");
                                input.next();
                            }
                            newRating = input.nextInt();
                        } while ((newRating < 1) || (newRating > 5));

                        for (FitnessClass i: fitArr) {
                            if (i.getClassName().equals(classChoice) && i.getDateTime().equals(dateAndTimeChoice)) {
                                classReview = new Review(newUser, i, newRating, newReview);
                                myMap.putIfAbsent(i, new ArrayList<Review>());
                                myMap.get(i).add(classReview);
                                i.addRating(classReview);
                            }
                        }

                    } else if (answer.equals("N")) {
                        System.out.println("");
                    }

                } else if (answer.equals("N")) {
                    System.out.println("");
                }
                System.out.println("Would you like to register for a new class? (type Y or N)");
                answer = input.next();
                if (answer.equals("Y")) {
                    continue;
                } else if (answer.equals("N")) {
                    classRegistrationLoop = false;
                }
            }
            while(classRegistrationLoop);

            //for test purposes, to delete for member and replace with smth else
            System.out.println("Showing classes and members: ");
            for (FitnessClass i: fitArr) {
                System.out.print("Class: " + i.getClassName() + 
                    "; " + i.getDateTime() +
                    "; Average rating: " + i.getAverageRating() +
                    "; Booked places: " + i.getTakenPlaces() +
                    "/" + (i.getAvailablePlaces()+i.getTakenPlaces()) + "\n");
            }
        }

        else if (answer.equals("2")) {
            //Admin console
            System.out.print("Please type your admin password (hint: admin): ");
            answer = input.next();

            if (answer.equals("admin")) {
                System.out.println("\nWelcome admin! \n" +
                    "Here are your reports: \n" +
                    "---------------------------- \n");
                System.out.println("1) Members per class and average rating: ");
                Map<String, ArrayList<Integer>> classPayment = new HashMap<String, ArrayList<Integer>>();
                ArrayList<Integer> paymentList = new ArrayList<Integer>();
                for (FitnessClass i: fitArr) {
                    System.out.print("Class: " + i.getClassName() + 
                        "; " + i.getDateTime() +
                        "; Average rating: " + i.getAverageRating() +
                        "; Booked places: " + i.getTakenPlaces() +
                        "/" + (i.getAvailablePlaces()+i.getTakenPlaces()) + 
                        "; Members: "+ i.getMembersListText() + 
                        "; Total: £" + i.getTotalPaymentForClass() + "\n");

                    int currentPayment = i.getTotalPaymentForClass();
                    classPayment.putIfAbsent(i.getClassName(), new ArrayList<Integer>());
                    classPayment.get(i.getClassName()).add(currentPayment);
                }

                System.out.println("---------------------------- \n");
                System.out.println("2) Highest income from class: ");
                //print aggregate classes and generated income with lambda
                classPayment.forEach((key, value) -> System.out.println(key + " - Total Income: £" + value.stream().mapToInt(i->i).sum()));
            }
        }
        else {
            System.out.print("Please select an option");
        }

    }
}

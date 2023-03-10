public static int getInt(Scanner pipe, String prompt) {
        int retInt;
        while (true) {
        try {
        System.out.print("\n" + prompt + ": ");
        String input = scanner.nextLine();
        retInt = Integer.parseInt(input);
        break;
        } catch (NumberFormatException e) {
        System.out.println("Please enter a valid integer.");
        }
        }
        return retInt;
        }

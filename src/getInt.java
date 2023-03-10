public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean validInput = false;

        while (!validInput) {
        System.out.print(prompt);

        if (pipe.hasNextInt()) {
        result = pipe.nextInt();
        validInput = true;
        } else {
        // Clear the pipe by reading the trash
        pipe.next();
        System.out.println("Invalid input. Please enter an integer.");
        }
        }

        return result;
        }

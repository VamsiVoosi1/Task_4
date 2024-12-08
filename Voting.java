package task4;


class Voting {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voting(int voterId, String name, int age) throws Exception {
        if (age < 18) {
            throw new Exception("Invalid age for Voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Getter methods for the fields
    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        try {
            // Attempt to create a voter with invalid age
            Voting voter = new Voting(1, "Vamsi", 10);
            System.out.println("Voter is Eligible " + voter.getName());
        } catch (Exception e) {
            // This block executes if age is less than 18
            System.out.println("Exception: " + e.getMessage());
        }


    }
}

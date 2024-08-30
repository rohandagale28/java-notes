
class StringInJava {

    // public static void main(String[] args) {
    //     // String name = "rohan";
    //     // System.out.println(name);
    //     // Scanner sc =  new Scanner(System.in);
    //     // String name = sc.nextLine();
    //     // System.out.println("Hello " + name);
    //     String firstName = "rohan";
    //     String lastName = "dagale";
    //     String fullName = firstName + " " + lastName;
    //     System.out.println(fullName);
    //     for (int i = 0; i < fullName.length(); i++) {
    //         System.out.println(fullName.charAt(i));
    //     }
    //     String reverse = "";
    //     for (int i = fullName.length() - 1; i >= 0; i--) {
    //         reverse += fullName.charAt(i);
    //     }
    //     System.out.println(reverse);
    // };
    //Selection sort
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                } 
            }
            int temp = arr[smallest];
            arr[i] = temp;

        }
        printArray(arr);
    }
}

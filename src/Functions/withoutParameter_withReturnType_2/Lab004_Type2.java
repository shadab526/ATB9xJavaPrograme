package Functions.withoutParameter_withReturnType_2;

public class Lab004_Type2 {
    public static void main(String[] args) {
        int weddingGirl = girls_wedding_age();
        System.out.println(weddingGirl);
        int wedding_Boy = boys_wedding_age();
        System.out.println(wedding_Boy);
        if(weddingGirl>=18 && wedding_Boy>=20){
            System.out.println("You can get marriage each other");
        }
        else {
            System.out.println("You can not marriage");
        }

    }
    static int girls_wedding_age(){
        System.out.println("Girl age is");
        return 16;
    }
    static int boys_wedding_age(){
        System.out.println("Boy age is");
        return 24;
    }
}

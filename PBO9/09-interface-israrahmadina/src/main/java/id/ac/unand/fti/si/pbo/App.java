package id.ac.unand.fti.si.pbo;



public class App {
    
    public static void main(String[] args) {
    
    MemberPlatinum member = new MemberPlatinum();
    member.hitungPembayaran(7000000);
    member.getPoin();

    MemberGold memberGold = new MemberGold();
    memberGold.hitungPembayaran(11005000);
    memberGold.getPoin();

    System.out.println("Member Gold"); 
    System.out.println("Polimorifisme");
    System.out.println("total belanjaan :" +11005000);
    System.out.println("Diskon: "+member.hitungPembayaran(1100500) );
    
    
    System.out.println("Member Platinum"); 
    System.out.println("Polimorifisme");
    System.out.println("total belanjaan :" +7000000);
    System.out.println("Diskon: "+member.hitungPembayaran(7000000) );
    }

    @Override
    public String toString() {
        return "App []";
    }
}
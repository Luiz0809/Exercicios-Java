package Lista05.parte02;
public class TestePetShop {
    
    public static void main(String[] args) {
        
        Pet pet1 = new Pet("Frank", "Gato");
        Pet pet2 = new Pet("Dumbo", "Cachorro");
        PetShop petShop = new PetShop("PetChique");
        
        System.out.println(pet1);
                System.out.println(pet2);
        
        petShop.darBanho(pet2, 25.00);
        petShop.darBanho(pet2, 38.55);
        petShop.darBanho(pet1, 54.74);
        
        System.out.println(pet1);
        System.out.println(pet2);
        
        petShop.darBanho(pet1, 22.00, 12);
        petShop.darBanho(pet1, 29.13, 9);
        petShop.darBanho(pet1, 36.54, 15);
        
        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(petShop);
    }
}

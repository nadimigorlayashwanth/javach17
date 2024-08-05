

public class PsychoRunner {
    public static void main(String[] args) {
        Psycho psycho = new Psycho(89, 5, "chainsaw");
        System.out.println("Kills: " +psycho.noofkills);
        System.out.println("Murders: " +psycho.nofmurders);
        System.out.println("Weapon used: " +psycho.weaponused);
    }
}

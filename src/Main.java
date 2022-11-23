public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setHp(111);
    boss.setDmg(300);
    boss.setName("Batman");
    boss.weapon.setWeaponName("Marlin");
    boss.weapon.setWeaponType(WeaponType.FIREARMS);
        System.out.println("Здоворье: " + boss.getHp() + "\nУрон: " + boss.getDmg() + "\nИмя: " + boss.getName() +
                "\nНазвание Оружия: " + boss.weapon.getWeaponName() + "\nТип Оружия: " + boss.weapon.getWeaponType());
    }
}
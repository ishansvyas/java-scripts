public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String permission = "";
        for (int i = 0; i<rights.length; i++) {
            if (rights[i] >= minPermission) {
                permission = permission.concat("A");
            }
            else {
                permission = permission.concat("D");
            }
        }
        return permission;
    }
}

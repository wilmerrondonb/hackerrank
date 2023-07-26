package com.hackerrank.java.JavaIntToString;

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {
    public static class ExitTrappedException extends SecurityException {
        private static final long serialVersionUID = 1;
    }
    //Created to avoid an error
    public static class Permission{
        public String getName(){
            return "";
        }
    }
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            //@Override : commented to avoid an error
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
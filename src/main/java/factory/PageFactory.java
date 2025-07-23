package factory;


import pages.LoginPage;
 
public class PageFactory {
 
    private static ThreadLocal<LoginPage> loginPageTL = new ThreadLocal<>();
 
    // Get LoginPage instance
    public static LoginPage getLoginPage() {
        if (loginPageTL.get() == null) {
            loginPageTL.set(new LoginPage());
        }
        return loginPageTL.get();
    }
 
	/*
	 * // Get AccountsPage instance public static AccountsPage getAccountsPage() {
	 * if (accountsPageTL.get() == null) { accountsPageTL.set(new AccountsPage()); }
	 * return accountsPageTL.get(); }
	 */
}
 
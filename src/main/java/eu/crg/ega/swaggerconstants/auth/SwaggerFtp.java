package eu.crg.ega.swaggerconstants.auth;

public class SwaggerFtp {

  public static final String DESCRIPTION = "Ftp users operations";

  public static final String MAP_FTP_USER = "Map FTP user to internal user Id";
  public static final String MAP_FTP_USER_NOTES = "Retrieve internal user Id using FTP's user Id";

  public static final String NEW_FTP_USER = "Create an FTP account";
  public static final String NEW_FTP_USER_NOTES =
      "Create or edit an FTP account. It creates the binding between the requester or submitter user and the FTP account created. ";

  public static final String EDIT_FTP_USER_NOTES = "Edit an FTP account";
  public static final String EDIT_FTP_USER =
      "Set password to null if you want to keep the stored one or provide any value to change it "
          + "(if the value provided does not fulfill password requirements the system will generate one).";

  public static final String LIST_USERS = "List FTP accounts";
  public static final String LIST_USERS_NOTES = "Set all parameters to null to list all accounts.";
  public static final String LIST_USERS_LOGIN_TYPE = "List FTP accounts by login type";
  public static final String LIST_USERS_AUTH_PROVIDER_ID = "List FTP accounts by authentication provider Id";

  public static final String GET_ACCOUNT_NOTES = "Retrieve an account by FTP Box";
  public static final String GET_ACCOUNT = "Get an account";
  
}

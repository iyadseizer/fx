package sy.iyad.mikrotik.Utils;


/**
 * Thrown when the Mikrotik returns an error when receiving our command.
 *
 * @author iyadFawwaz
 */
public class ApiCommandException extends MikrotikApiException {

    private String tag = null;
    private int category = 0;

    /**
     * return the tag associated with this exception, if there is one
     *
     * @return the tag associated with this exception. Null if there is no tag
     */
    public String getTag() {
        return tag;
    }

    ApiCommandException(String msg) {
        super(msg);
    }

    ApiCommandException(String msg, Throwable err) {
        super(msg, err);
    }

    public int getCategory() {
        return category;
    }

    ApiCommandException(Error err) {
        super(err.getMessage());
        tag = err.getTag();
        category = err.getCategory();
    }


}

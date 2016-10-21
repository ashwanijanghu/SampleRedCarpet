
package jango.com.sampleredcarpet.models;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ReferralDestination {

    @SerializedName("site_name")
    @Expose
    private String siteName;
    @SerializedName("uri")
    @Expose
    private String uri;

    /**
     * 
     * @return
     *     The siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * 
     * @param siteName
     *     The site_name
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * 
     * @return
     *     The uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * 
     * @param uri
     *     The uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

}

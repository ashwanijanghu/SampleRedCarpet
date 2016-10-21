
package jango.com.sampleredcarpet.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("display_sizes")
    @Expose
    private List<DisplaySize> displaySizes = new ArrayList<DisplaySize>();
    @SerializedName("referral_destinations")
    @Expose
    private List<ReferralDestination> referralDestinations = new ArrayList<ReferralDestination>();
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The displaySizes
     */
    public List<DisplaySize> getDisplaySizes() {
        return displaySizes;
    }

    /**
     * 
     * @param displaySizes
     *     The display_sizes
     */
    public void setDisplaySizes(List<DisplaySize> displaySizes) {
        this.displaySizes = displaySizes;
    }

    /**
     * 
     * @return
     *     The referralDestinations
     */
    public List<ReferralDestination> getReferralDestinations() {
        return referralDestinations;
    }

    /**
     * 
     * @param referralDestinations
     *     The referral_destinations
     */
    public void setReferralDestinations(List<ReferralDestination> referralDestinations) {
        this.referralDestinations = referralDestinations;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}

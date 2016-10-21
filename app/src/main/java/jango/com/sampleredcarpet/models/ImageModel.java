
package jango.com.sampleredcarpet.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ImageModel {

    @SerializedName("result_count")
    @Expose
    private Integer resultCount;
    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();

    /**
     * 
     * @return
     *     The resultCount
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /**
     * 
     * @param resultCount
     *     The result_count
     */
    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

}

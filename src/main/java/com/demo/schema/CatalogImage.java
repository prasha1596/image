
package com.demo.schema;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CatalogImage
 * <p>
 * A image from Image catalog
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "image-id",
    "image-format",
    "image-path",
    "meta-data"
})
public class CatalogImage {

    /**
     * The unique identifier for an image.
     * 
     */
    @JsonProperty("image-id")
    @JsonPropertyDescription("The unique identifier for an image.")
    private String imageId;
    /**
     * Format of image (gif, png, jpeg, etc.).
     * 
     */
    @JsonProperty("image-format")
    @JsonPropertyDescription("Format of image (gif, png, jpeg, etc.).")
    private String imageFormat;
    /**
     * Path/URL to the image data.
     * 
     */
    @JsonProperty("image-path")
    @JsonPropertyDescription("Path/URL to the image data.")
    private String imagePath;
    /**
     * Metadata item describing resource.
     * 
     */
    @JsonProperty("meta-data")
    @JsonPropertyDescription("Metadata item describing resource.")
    private List<CatalogMetaDatum> metaData = new ArrayList<CatalogMetaDatum>();

    /**
     * The unique identifier for an image.
     * 
     */
    @JsonProperty("image-id")
    public String getImageId() {
        return imageId;
    }

    /**
     * The unique identifier for an image.
     * 
     */
    @JsonProperty("image-id")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * Format of image (gif, png, jpeg, etc.).
     * 
     */
    @JsonProperty("image-format")
    public String getImageFormat() {
        return imageFormat;
    }

    /**
     * Format of image (gif, png, jpeg, etc.).
     * 
     */
    @JsonProperty("image-format")
    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    /**
     * Path/URL to the image data.
     * 
     */
    @JsonProperty("image-path")
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Path/URL to the image data.
     * 
     */
    @JsonProperty("image-path")
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * Metadata item describing resource.
     * 
     */
    @JsonProperty("meta-data")
    public List<CatalogMetaDatum> getMetaData() {
        return metaData;
    }

    /**
     * Metadata item describing resource.
     * 
     */
    @JsonProperty("meta-data")
    public void setMetaData(List<CatalogMetaDatum> metaData) {
        this.metaData = metaData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CatalogImage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("imageId");
        sb.append('=');
        sb.append(((this.imageId == null)?"<null>":this.imageId));
        sb.append(',');
        sb.append("imageFormat");
        sb.append('=');
        sb.append(((this.imageFormat == null)?"<null>":this.imageFormat));
        sb.append(',');
        sb.append("imagePath");
        sb.append('=');
        sb.append(((this.imagePath == null)?"<null>":this.imagePath));
        sb.append(',');
        sb.append("metaData");
        sb.append('=');
        sb.append(((this.metaData == null)?"<null>":this.metaData));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.imageFormat == null)? 0 :this.imageFormat.hashCode()));
        result = ((result* 31)+((this.metaData == null)? 0 :this.metaData.hashCode()));
        result = ((result* 31)+((this.imageId == null)? 0 :this.imageId.hashCode()));
        result = ((result* 31)+((this.imagePath == null)? 0 :this.imagePath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CatalogImage) == false) {
            return false;
        }
        CatalogImage rhs = ((CatalogImage) other);
        return (((((this.imageFormat == rhs.imageFormat)||((this.imageFormat!= null)&&this.imageFormat.equals(rhs.imageFormat)))&&((this.metaData == rhs.metaData)||((this.metaData!= null)&&this.metaData.equals(rhs.metaData))))&&((this.imageId == rhs.imageId)||((this.imageId!= null)&&this.imageId.equals(rhs.imageId))))&&((this.imagePath == rhs.imagePath)||((this.imagePath!= null)&&this.imagePath.equals(rhs.imagePath))));
    }

}

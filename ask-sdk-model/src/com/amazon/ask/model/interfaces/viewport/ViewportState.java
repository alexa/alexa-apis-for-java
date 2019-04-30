/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/


package com.amazon.ask.model.interfaces.viewport;

import java.util.Objects;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * This object contains the characteristics related to the device&#39;s viewport.
 */

@JsonDeserialize(builder = ViewportState.Builder.class)
public final class ViewportState{

  @JsonProperty("experiences")
  private List<com.amazon.ask.model.interfaces.viewport.Experience> experiences = new ArrayList<com.amazon.ask.model.interfaces.viewport.Experience>();

  @JsonProperty("shape")
  private com.amazon.ask.model.interfaces.viewport.Shape shape = null;

  @JsonProperty("pixelWidth")
  private BigDecimal pixelWidth = null;

  @JsonProperty("pixelHeight")
  private BigDecimal pixelHeight = null;

  @JsonProperty("dpi")
  private BigDecimal dpi = null;

  @JsonProperty("currentPixelWidth")
  private BigDecimal currentPixelWidth = null;

  @JsonProperty("currentPixelHeight")
  private BigDecimal currentPixelHeight = null;

  @JsonProperty("touch")
  private List<com.amazon.ask.model.interfaces.viewport.Touch> touch = new ArrayList<com.amazon.ask.model.interfaces.viewport.Touch>();

  @JsonProperty("keyboard")
  private List<com.amazon.ask.model.interfaces.viewport.Keyboard> keyboard = new ArrayList<com.amazon.ask.model.interfaces.viewport.Keyboard>();

  @JsonProperty("video")
  private com.amazon.ask.model.interfaces.viewport.ViewportStateVideo video = null;

  public static Builder builder() {
    return new Builder();
  }

  private ViewportState(Builder builder) {
    this.experiences = builder.experiences;
    this.shape = builder.shape;
    this.pixelWidth = builder.pixelWidth;
    this.pixelHeight = builder.pixelHeight;
    this.dpi = builder.dpi;
    this.currentPixelWidth = builder.currentPixelWidth;
    this.currentPixelHeight = builder.currentPixelHeight;
    this.touch = builder.touch;
    this.keyboard = builder.keyboard;
    this.video = builder.video;
  }

  /**
    * The experiences supported by the device, in descending order of arcMinuteWidth and arcMinuteHeight.
  * @return experiences
  **/
  public List<com.amazon.ask.model.interfaces.viewport.Experience> getExperiences() {
    return experiences;
  }

  /**
    * Get shape
  * @return shape
  **/
  public com.amazon.ask.model.interfaces.viewport.Shape getShape() {
    return shape;
  }

  /**
    * The number of pixels present in the viewport at its maximum width.
  * @return pixelWidth
  **/
  public BigDecimal getPixelWidth() {
    return pixelWidth;
  }

  /**
    * The number of pixels present in the viewport at its maximum height.
  * @return pixelHeight
  **/
  public BigDecimal getPixelHeight() {
    return pixelHeight;
  }

  /**
    * The pixel density of the viewport.
  * @return dpi
  **/
  public BigDecimal getDpi() {
    return dpi;
  }

  /**
    * The number of horizontal pixels in the viewport that are currently available for Alexa to render an experience.
  * @return currentPixelWidth
  **/
  public BigDecimal getCurrentPixelWidth() {
    return currentPixelWidth;
  }

  /**
    * The number of vertical pixels in the viewport that are currently available for Alexa to render an experience.
  * @return currentPixelHeight
  **/
  public BigDecimal getCurrentPixelHeight() {
    return currentPixelHeight;
  }

  /**
    * The types of touch supported by the device. An empty array indicates no touch support.
  * @return touch
  **/
  public List<com.amazon.ask.model.interfaces.viewport.Touch> getTouch() {
    return touch;
  }

  /**
    * The physical button input mechanisms supported by the device. An empty array indicates physical button input is unsupported.
  * @return keyboard
  **/
  public List<com.amazon.ask.model.interfaces.viewport.Keyboard> getKeyboard() {
    return keyboard;
  }

  /**
    * Get video
  * @return video
  **/
  public com.amazon.ask.model.interfaces.viewport.ViewportStateVideo getVideo() {
    return video;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewportState interfacesViewportViewportState = (ViewportState) o;
    return Objects.equals(this.experiences, interfacesViewportViewportState.experiences) &&
        Objects.equals(this.shape, interfacesViewportViewportState.shape) &&
        Objects.equals(this.pixelWidth, interfacesViewportViewportState.pixelWidth) &&
        Objects.equals(this.pixelHeight, interfacesViewportViewportState.pixelHeight) &&
        Objects.equals(this.dpi, interfacesViewportViewportState.dpi) &&
        Objects.equals(this.currentPixelWidth, interfacesViewportViewportState.currentPixelWidth) &&
        Objects.equals(this.currentPixelHeight, interfacesViewportViewportState.currentPixelHeight) &&
        Objects.equals(this.touch, interfacesViewportViewportState.touch) &&
        Objects.equals(this.keyboard, interfacesViewportViewportState.keyboard) &&
        Objects.equals(this.video, interfacesViewportViewportState.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiences, shape, pixelWidth, pixelHeight, dpi, currentPixelWidth, currentPixelHeight, touch, keyboard, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewportState {\n");
    
    sb.append("    experiences: ").append(toIndentedString(experiences)).append("\n");
    sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
    sb.append("    pixelWidth: ").append(toIndentedString(pixelWidth)).append("\n");
    sb.append("    pixelHeight: ").append(toIndentedString(pixelHeight)).append("\n");
    sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
    sb.append("    currentPixelWidth: ").append(toIndentedString(currentPixelWidth)).append("\n");
    sb.append("    currentPixelHeight: ").append(toIndentedString(currentPixelHeight)).append("\n");
    sb.append("    touch: ").append(toIndentedString(touch)).append("\n");
    sb.append("    keyboard: ").append(toIndentedString(keyboard)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static class Builder {
    private List<com.amazon.ask.model.interfaces.viewport.Experience> experiences;
    private com.amazon.ask.model.interfaces.viewport.Shape shape;
    private BigDecimal pixelWidth;
    private BigDecimal pixelHeight;
    private BigDecimal dpi;
    private BigDecimal currentPixelWidth;
    private BigDecimal currentPixelHeight;
    private List<com.amazon.ask.model.interfaces.viewport.Touch> touch;
    private List<com.amazon.ask.model.interfaces.viewport.Keyboard> keyboard;
    private com.amazon.ask.model.interfaces.viewport.ViewportStateVideo video;

    private Builder() { }

    @JsonProperty("experiences")
    public Builder withExperiences(List<com.amazon.ask.model.interfaces.viewport.Experience> experiences) {
      this.experiences = experiences;
      return this;
    }
      
    public Builder addExperiencesItem(com.amazon.ask.model.interfaces.viewport.Experience experiencesItem) {
      if (this.experiences == null) {
        this.experiences = new ArrayList<com.amazon.ask.model.interfaces.viewport.Experience>();
      }
      this.experiences.add(experiencesItem);
      return this;
    }

    @JsonProperty("shape")
    public Builder withShape(com.amazon.ask.model.interfaces.viewport.Shape shape) {
      this.shape = shape;
      return this;
    }
      

    @JsonProperty("pixelWidth")
    public Builder withPixelWidth(BigDecimal pixelWidth) {
      this.pixelWidth = pixelWidth;
      return this;
    }
      

    @JsonProperty("pixelHeight")
    public Builder withPixelHeight(BigDecimal pixelHeight) {
      this.pixelHeight = pixelHeight;
      return this;
    }
      

    @JsonProperty("dpi")
    public Builder withDpi(BigDecimal dpi) {
      this.dpi = dpi;
      return this;
    }
      

    @JsonProperty("currentPixelWidth")
    public Builder withCurrentPixelWidth(BigDecimal currentPixelWidth) {
      this.currentPixelWidth = currentPixelWidth;
      return this;
    }
      

    @JsonProperty("currentPixelHeight")
    public Builder withCurrentPixelHeight(BigDecimal currentPixelHeight) {
      this.currentPixelHeight = currentPixelHeight;
      return this;
    }
      

    @JsonProperty("touch")
    public Builder withTouch(List<com.amazon.ask.model.interfaces.viewport.Touch> touch) {
      this.touch = touch;
      return this;
    }
      
    public Builder addTouchItem(com.amazon.ask.model.interfaces.viewport.Touch touchItem) {
      if (this.touch == null) {
        this.touch = new ArrayList<com.amazon.ask.model.interfaces.viewport.Touch>();
      }
      this.touch.add(touchItem);
      return this;
    }

    @JsonProperty("keyboard")
    public Builder withKeyboard(List<com.amazon.ask.model.interfaces.viewport.Keyboard> keyboard) {
      this.keyboard = keyboard;
      return this;
    }
      
    public Builder addKeyboardItem(com.amazon.ask.model.interfaces.viewport.Keyboard keyboardItem) {
      if (this.keyboard == null) {
        this.keyboard = new ArrayList<com.amazon.ask.model.interfaces.viewport.Keyboard>();
      }
      this.keyboard.add(keyboardItem);
      return this;
    }

    @JsonProperty("video")
    public Builder withVideo(com.amazon.ask.model.interfaces.viewport.ViewportStateVideo video) {
      this.video = video;
      return this;
    }
      

    public ViewportState build() {
      return new ViewportState(this);
    }
  }
}


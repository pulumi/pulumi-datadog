// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.datadog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PowerpackWidgetNoteDefinitionArgs extends com.pulumi.resources.ResourceArgs {

    public static final PowerpackWidgetNoteDefinitionArgs Empty = new PowerpackWidgetNoteDefinitionArgs();

    /**
     * The background color of the note.
     * 
     */
    @Import(name="backgroundColor")
    private @Nullable Output<String> backgroundColor;

    /**
     * @return The background color of the note.
     * 
     */
    public Optional<Output<String>> backgroundColor() {
        return Optional.ofNullable(this.backgroundColor);
    }

    /**
     * The content of the note.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The content of the note.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The size of the text in the widget.
     * 
     */
    @Import(name="fontSize")
    private @Nullable Output<String> fontSize;

    /**
     * @return The size of the text in the widget.
     * 
     */
    public Optional<Output<String>> fontSize() {
        return Optional.ofNullable(this.fontSize);
    }

    /**
     * Whether to add padding or not. Defaults to `true`.
     * 
     */
    @Import(name="hasPadding")
    private @Nullable Output<Boolean> hasPadding;

    /**
     * @return Whether to add padding or not. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> hasPadding() {
        return Optional.ofNullable(this.hasPadding);
    }

    /**
     * Whether to show a tick or not.
     * 
     */
    @Import(name="showTick")
    private @Nullable Output<Boolean> showTick;

    /**
     * @return Whether to show a tick or not.
     * 
     */
    public Optional<Output<Boolean>> showTick() {
        return Optional.ofNullable(this.showTick);
    }

    /**
     * The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
     * 
     */
    @Import(name="textAlign")
    private @Nullable Output<String> textAlign;

    /**
     * @return The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
     * 
     */
    public Optional<Output<String>> textAlign() {
        return Optional.ofNullable(this.textAlign);
    }

    /**
     * When `tick = true`, a string indicating on which side of the widget the tick should be displayed. Valid values are `bottom`, `left`, `right`, `top`.
     * 
     */
    @Import(name="tickEdge")
    private @Nullable Output<String> tickEdge;

    /**
     * @return When `tick = true`, a string indicating on which side of the widget the tick should be displayed. Valid values are `bottom`, `left`, `right`, `top`.
     * 
     */
    public Optional<Output<String>> tickEdge() {
        return Optional.ofNullable(this.tickEdge);
    }

    /**
     * When `tick = true`, a string with a percent sign indicating the position of the tick, for example: `tick_pos = &#34;50%&#34;` is centered alignment.
     * 
     */
    @Import(name="tickPos")
    private @Nullable Output<String> tickPos;

    /**
     * @return When `tick = true`, a string with a percent sign indicating the position of the tick, for example: `tick_pos = &#34;50%&#34;` is centered alignment.
     * 
     */
    public Optional<Output<String>> tickPos() {
        return Optional.ofNullable(this.tickPos);
    }

    /**
     * The vertical alignment for the widget. Valid values are `center`, `top`, `bottom`.
     * 
     */
    @Import(name="verticalAlign")
    private @Nullable Output<String> verticalAlign;

    /**
     * @return The vertical alignment for the widget. Valid values are `center`, `top`, `bottom`.
     * 
     */
    public Optional<Output<String>> verticalAlign() {
        return Optional.ofNullable(this.verticalAlign);
    }

    private PowerpackWidgetNoteDefinitionArgs() {}

    private PowerpackWidgetNoteDefinitionArgs(PowerpackWidgetNoteDefinitionArgs $) {
        this.backgroundColor = $.backgroundColor;
        this.content = $.content;
        this.fontSize = $.fontSize;
        this.hasPadding = $.hasPadding;
        this.showTick = $.showTick;
        this.textAlign = $.textAlign;
        this.tickEdge = $.tickEdge;
        this.tickPos = $.tickPos;
        this.verticalAlign = $.verticalAlign;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PowerpackWidgetNoteDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PowerpackWidgetNoteDefinitionArgs $;

        public Builder() {
            $ = new PowerpackWidgetNoteDefinitionArgs();
        }

        public Builder(PowerpackWidgetNoteDefinitionArgs defaults) {
            $ = new PowerpackWidgetNoteDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backgroundColor The background color of the note.
         * 
         * @return builder
         * 
         */
        public Builder backgroundColor(@Nullable Output<String> backgroundColor) {
            $.backgroundColor = backgroundColor;
            return this;
        }

        /**
         * @param backgroundColor The background color of the note.
         * 
         * @return builder
         * 
         */
        public Builder backgroundColor(String backgroundColor) {
            return backgroundColor(Output.of(backgroundColor));
        }

        /**
         * @param content The content of the note.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the note.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param fontSize The size of the text in the widget.
         * 
         * @return builder
         * 
         */
        public Builder fontSize(@Nullable Output<String> fontSize) {
            $.fontSize = fontSize;
            return this;
        }

        /**
         * @param fontSize The size of the text in the widget.
         * 
         * @return builder
         * 
         */
        public Builder fontSize(String fontSize) {
            return fontSize(Output.of(fontSize));
        }

        /**
         * @param hasPadding Whether to add padding or not. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder hasPadding(@Nullable Output<Boolean> hasPadding) {
            $.hasPadding = hasPadding;
            return this;
        }

        /**
         * @param hasPadding Whether to add padding or not. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder hasPadding(Boolean hasPadding) {
            return hasPadding(Output.of(hasPadding));
        }

        /**
         * @param showTick Whether to show a tick or not.
         * 
         * @return builder
         * 
         */
        public Builder showTick(@Nullable Output<Boolean> showTick) {
            $.showTick = showTick;
            return this;
        }

        /**
         * @param showTick Whether to show a tick or not.
         * 
         * @return builder
         * 
         */
        public Builder showTick(Boolean showTick) {
            return showTick(Output.of(showTick));
        }

        /**
         * @param textAlign The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder textAlign(@Nullable Output<String> textAlign) {
            $.textAlign = textAlign;
            return this;
        }

        /**
         * @param textAlign The alignment of the text in the widget. Valid values are `center`, `left`, `right`.
         * 
         * @return builder
         * 
         */
        public Builder textAlign(String textAlign) {
            return textAlign(Output.of(textAlign));
        }

        /**
         * @param tickEdge When `tick = true`, a string indicating on which side of the widget the tick should be displayed. Valid values are `bottom`, `left`, `right`, `top`.
         * 
         * @return builder
         * 
         */
        public Builder tickEdge(@Nullable Output<String> tickEdge) {
            $.tickEdge = tickEdge;
            return this;
        }

        /**
         * @param tickEdge When `tick = true`, a string indicating on which side of the widget the tick should be displayed. Valid values are `bottom`, `left`, `right`, `top`.
         * 
         * @return builder
         * 
         */
        public Builder tickEdge(String tickEdge) {
            return tickEdge(Output.of(tickEdge));
        }

        /**
         * @param tickPos When `tick = true`, a string with a percent sign indicating the position of the tick, for example: `tick_pos = &#34;50%&#34;` is centered alignment.
         * 
         * @return builder
         * 
         */
        public Builder tickPos(@Nullable Output<String> tickPos) {
            $.tickPos = tickPos;
            return this;
        }

        /**
         * @param tickPos When `tick = true`, a string with a percent sign indicating the position of the tick, for example: `tick_pos = &#34;50%&#34;` is centered alignment.
         * 
         * @return builder
         * 
         */
        public Builder tickPos(String tickPos) {
            return tickPos(Output.of(tickPos));
        }

        /**
         * @param verticalAlign The vertical alignment for the widget. Valid values are `center`, `top`, `bottom`.
         * 
         * @return builder
         * 
         */
        public Builder verticalAlign(@Nullable Output<String> verticalAlign) {
            $.verticalAlign = verticalAlign;
            return this;
        }

        /**
         * @param verticalAlign The vertical alignment for the widget. Valid values are `center`, `top`, `bottom`.
         * 
         * @return builder
         * 
         */
        public Builder verticalAlign(String verticalAlign) {
            return verticalAlign(Output.of(verticalAlign));
        }

        public PowerpackWidgetNoteDefinitionArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("PowerpackWidgetNoteDefinitionArgs", "content");
            }
            return $;
        }
    }

}
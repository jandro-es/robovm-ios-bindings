
package org.robovm.bindings.facebook.dialogs;

import org.robovm.apple.foundation.NSURL;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Pointer;

/** This object is used to encapsulate state for parameters to a share a link, typically with the Facebook Native Share Dialog or
 * the Message Dialog. */
@NativeClass
public class FBLinkShareParams extends FBDialogsParams {

    /** The URL link to be attached to the post. Only "http" or "https" schemes are supported. */
    @Property
    public native NSURL getLink ();

    @Property
    public native void setLink (NSURL link);

    /** abstract The name, or title associated with the link. Is only used if the link is not null. */
    @Property
    public native String getName ();

    @Property
    public native void setName (String name);

    /*
     * ! @abstract The caption to be used with the link. Is only used if the link is non-nil.
     */
    @Property
    public native String getCaption ();

    @Property
    public native void setCaption (String caption);

    /*
     * ! @abstract The description associated with the link. Is only used if the link is non-nil.
     */
    @Property
    public native String getLinkDescription ();

    @Property
    public native void setLinkDescription (String linkDescription);

    /*
     * ! @abstract The link to a thumbnail to associate with the post. Is only used if the link is non-nil. Only "http" or "https"
     * schemes are supported. Note that this property should not be used to share photos; see the photos property.
     */
    @Property
    public native NSURL getPicture ();

    @Property
    public native void setPicture (NSURL picture);

// /*! @abstract An array of NSStrings or FBGraphUsers to tag in the post.
// If using NSStrings, the values must represent the IDs of the users to tag. */
// @property (nonatomic, copy) NSArray *friends;

// /*! @abstract An NSString or FBGraphPlace to tag in the status update. If
// NSString, the value must be the ID of the place to tag. */
// @property (nonatomic, copy) id place;

// /*! @abstract A text reference for the category of the post, used on Facebook
// Insights. */
// @property (nonatomic, copy) NSString *ref;

// /*! @abstract If YES, treats any data failures (e.g. failures when getting
// data for IDs passed through "friends" or "place") as a fatal error, and will not
// continue with the status update. */
// @property (nonatomic, assign) BOOL dataFailuresFatal;

    /** @param link the required link to share
     * @param name the optional name to describe the share
     * @param caption the optional caption to describe the share
     * @param description the optional description to describe the share
     * @param picture the optional url to use as the share's image */
    public FBLinkShareParams (NSURL link, String name, String caption, String description, NSURL picture) {
        super((SkipInit)null);
        initObject(init(link, name, caption, description, picture));
    }

    @Method(selector = "initWithLink:name:caption:description:picture:")
    public native @Pointer long init (NSURL link, String name, String caption, String description, NSURL picture);
}

# Base this image on core-image-minimal
include recipes-core/images/core-image-base.bb

IMAGE_INSTALL += "hello-world cronie"



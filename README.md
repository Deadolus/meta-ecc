This README file contains information on the contents of the
ecc layer.

Please see the corresponding sections below for details.


Dependencies
============

This layer depends on:

    URI: git://git.yoctoproject.org/poky.git
    branch: master


Patches
=======

Please submit any patches against the ecc layer to:

Maintainer: Simon Egli <simon.egli -aT- bbv.ch>


Table of Contents
=================

  [I. Adding the ecc layer to your build](https://github.com/Deadolus/meta-ecc#i-adding-the-ecc-layer-to-your-build)  
  [II. Building the ecc-image](https://github.com/Deadolus/meta-ecc#ii-building-the-ecc-image)  
  [III. Misc](https://github.com/Deadolus/meta-ecc#iii-misc)  


## I. Adding the ecc layer to your build ##

```
cd ~ && mkdir yocto && cd yocto 
git clone git://git.yoctoproject.org/poky.git
cd ~/yocto/poky
git clone git@github.com:Deadolus/meta-ecc.git
cd ~/yocto
source poky/oe-init-build-env
```

In order to use this layer, you need to make the build system aware of
it.

Assuming the ecc layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the ecc layer to bblayers.conf, along with any
other layers needed. e.g.:

  ```
  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-yocto \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-ecc \
    "
  ```

This is typically in ~/yocto/build/conf/bblayers.conf

## II. Building the ecc-image ##

To build the meta-ecc example image "ecc-image" (assuming I: has been done):

```
cd ~/yocto/
source poky/oe-init-build-env
bitbake ecc-image
```

The finished image can then be found under

    ~/yocto/build/tmp/deploy/qemux86/


## III. Misc ##

This is a demo layer accompanying the talk of Simon Egli at the [ECC-Kongress 2016](http://www.swisst.net/ecc16.html).
It ads a recipe and patches another recipe.  
Working as of May 2016, but don't expect anything useful for production from this demo layer.

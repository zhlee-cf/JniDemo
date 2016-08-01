//
// Created by lzh12 on 2016/6/20.
//

#include "com_im_jnidemo_NdkJniUtils.h"
/*
 * Class:     com_im_jnidemo_NdkJniUtils
 * Method:    getCLanguageString
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_im_jnidemo_NdkJniUtils_getCLanguageString
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
}

#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_becomevegan_com_becomevegan_Restuarant_Activity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

# kotlin-native-serialization-bug

Fails on release build with error:

```
Uncaught Kotlin exception: kotlin.RuntimeException: Unexpected receiver type: kotlin.native.concurrent.FreezeAwareLazyImpl
    at ThrowInvalidReceiverTypeException (0x41a65d)
    at kfun:Event.Companion#serializer(kotlin.Array<out|kotlinx.serialization.KSerializer<*>>...){}kotlinx.serialization.KSerializer<*> (0x448999)
    at kfun:kotlinx.serialization.internal#constructSerializerForGivenTypeArgs__at__kotlin.reflect.KClass<0:0>(kotlin.Array<out|kotlinx.serialization.KSerializer<kotlin.Any?>>...){0§<kotlin.Any>}kotlinx.serialization.KSerializer<0:0>? (0x441537)
    at kfun:kotlinx.serialization.internal#compiledSerializerImpl__at__kotlin.reflect.KClass<0:0>(){0§<kotlin.Any>}kotlinx.serialization.KSerializer<0:0>? (0x44119c)
    at kfun:kotlinx.serialization#serializerOrNull__at__kotlin.reflect.KClass<0:0>(){0§<kotlin.Any>}kotlinx.serialization.KSerializer<0:0>? (0x4290cd)
    at kfun:kotlinx.serialization.serializerByKTypeImpl#internal (0x426975)
    at kfun:kotlinx.serialization#serializer__at__kotlinx.serialization.modules.SerializersModule(kotlin.reflect.KType){}kotlinx.serialization.KSerializer<kotlin.Any?> (0x426541)
    at Init_and_run_start (0x47c771)
    at __libc_start_main (0x7fb76c3e8b25)
    at  (0x404db1)
    at  ((nil))
```


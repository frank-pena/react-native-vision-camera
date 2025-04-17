package com.mrousavy.camera.core.types


enum class CameraOrientation(override val unionValue: String):JSUnionValue  {
  PORTRAIT("portrait"),
  LANDSCAPE("portrait");

  companion object: JSUnionValue.Companion<CameraOrientation>{
    override fun fromUnionValue(unionValue: String?): CameraOrientation {
      return when(unionValue){
        "portrait" -> PORTRAIT
        "landscape" -> LANDSCAPE
        else -> PORTRAIT
      }
    }
  }

}

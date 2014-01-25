import android.Keys._

android.Plugin.androidBuild

name := "Remember The Pebble"

scalaVersion := "2.10.3"

platformTarget in Android := "android-14"

run <<= run in Android

install <<= install in Android
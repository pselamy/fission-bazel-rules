load("@rules_java//java:defs.bzl", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

proto_library(
    name = "http_proto",
    srcs = ["http.proto"],
)

java_proto_library(
    name = "http_java_proto",
    visibility = ["//visibility:public"],
    deps = [
        ":http_proto",
    ],
)

load("@com_google_protobuf//:protobuf.bzl", "py_proto_library")
load("@rules_java//java:defs.bzl", "java_binary", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

proto_library(
    name = "http_proto",
    srcs = ["http.proto"],
)

py_proto_library(
    name = "http_python_proto",
    srcs = ["http.proto"],
)

java_proto_library(
    name = "http_java_proto",
    visibility = ["//visibility:public"],
    deps = [":http_proto",],
)

java_binary(
    name = "echo",
    srcs = [
        "Echo.java",
    ],
    main_class = "Echo",
    deps = [
        ":http_java_proto",
        "@com_google_protobuf//:protobuf_java",
        "@maven//:com_google_guava_guava",
    ],
)

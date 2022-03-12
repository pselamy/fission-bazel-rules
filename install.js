const njb = require("node-java-connector");
const jre_version = process.env.JRE_VERSION || 8;

njb
 .install(jre_version, { type: "jre" })
 .then(dir => {})
 .catch(err => {
  console.log(err);
 });

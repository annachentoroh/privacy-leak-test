resource "aws_s3_bucket" "my_bucket" {
  bucket = "my-bucket"
  acl    = "public-read"  # Vulnerability: Publicly readable bucket
}
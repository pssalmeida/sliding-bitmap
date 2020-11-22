# Sliding Bitmap

Resizable bitmap suitable for representing a set of element in a sliding window.
Elements are added as ranges of new elements contiguous to the previous
range. Elements can be removed or tested for presence, but can only be
added within the current window. The representation grows as needed and
discards memory corresponding to elements before the smallest element still
present (start of sliding window).

## Usage

Clone from github and install with `mvn install`.

Add as dependency:

```
    <dependency>
      <groupId>io.github.pssalmeida</groupId>
      <artifactId>slidingbitmap</artifactId>
      <version>0.1</version>
    </dependency>
```

## API

See javadoc.


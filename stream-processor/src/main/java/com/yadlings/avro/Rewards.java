/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.yadlings.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Rewards extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7961692060278202711L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Rewards\",\"namespace\":\"com.yadlings.avro\",\"fields\":[{\"name\":\"customerId\",\"type\":\"long\",\"default\":0},{\"name\":\"currentPoints\",\"type\":\"double\",\"default\":0},{\"name\":\"total\",\"type\":\"double\",\"default\":0},{\"name\":\"lastTransactionDate\",\"type\":\"string\",\",default\":\"\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Rewards> ENCODER =
      new BinaryMessageEncoder<Rewards>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Rewards> DECODER =
      new BinaryMessageDecoder<Rewards>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Rewards> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Rewards> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Rewards> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Rewards>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Rewards to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Rewards from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Rewards instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Rewards fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long customerId;
   private double currentPoints;
   private double total;
   private java.lang.CharSequence lastTransactionDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Rewards() {}

  /**
   * All-args constructor.
   * @param customerId The new value for customerId
   * @param currentPoints The new value for currentPoints
   * @param total The new value for total
   * @param lastTransactionDate The new value for lastTransactionDate
   */
  public Rewards(java.lang.Long customerId, java.lang.Double currentPoints, java.lang.Double total, java.lang.CharSequence lastTransactionDate) {
    this.customerId = customerId;
    this.currentPoints = currentPoints;
    this.total = total;
    this.lastTransactionDate = lastTransactionDate;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerId;
    case 1: return currentPoints;
    case 2: return total;
    case 3: return lastTransactionDate;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerId = (java.lang.Long)value$; break;
    case 1: currentPoints = (java.lang.Double)value$; break;
    case 2: total = (java.lang.Double)value$; break;
    case 3: lastTransactionDate = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public long getCustomerId() {
    return customerId;
  }


  /**
   * Sets the value of the 'customerId' field.
   * @param value the value to set.
   */
  public void setCustomerId(long value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'currentPoints' field.
   * @return The value of the 'currentPoints' field.
   */
  public double getCurrentPoints() {
    return currentPoints;
  }


  /**
   * Sets the value of the 'currentPoints' field.
   * @param value the value to set.
   */
  public void setCurrentPoints(double value) {
    this.currentPoints = value;
  }

  /**
   * Gets the value of the 'total' field.
   * @return The value of the 'total' field.
   */
  public double getTotal() {
    return total;
  }


  /**
   * Sets the value of the 'total' field.
   * @param value the value to set.
   */
  public void setTotal(double value) {
    this.total = value;
  }

  /**
   * Gets the value of the 'lastTransactionDate' field.
   * @return The value of the 'lastTransactionDate' field.
   */
  public java.lang.CharSequence getLastTransactionDate() {
    return lastTransactionDate;
  }


  /**
   * Sets the value of the 'lastTransactionDate' field.
   * @param value the value to set.
   */
  public void setLastTransactionDate(java.lang.CharSequence value) {
    this.lastTransactionDate = value;
  }

  /**
   * Creates a new Rewards RecordBuilder.
   * @return A new Rewards RecordBuilder
   */
  public static com.yadlings.avro.Rewards.Builder newBuilder() {
    return new com.yadlings.avro.Rewards.Builder();
  }

  /**
   * Creates a new Rewards RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Rewards RecordBuilder
   */
  public static com.yadlings.avro.Rewards.Builder newBuilder(com.yadlings.avro.Rewards.Builder other) {
    if (other == null) {
      return new com.yadlings.avro.Rewards.Builder();
    } else {
      return new com.yadlings.avro.Rewards.Builder(other);
    }
  }

  /**
   * Creates a new Rewards RecordBuilder by copying an existing Rewards instance.
   * @param other The existing instance to copy.
   * @return A new Rewards RecordBuilder
   */
  public static com.yadlings.avro.Rewards.Builder newBuilder(com.yadlings.avro.Rewards other) {
    if (other == null) {
      return new com.yadlings.avro.Rewards.Builder();
    } else {
      return new com.yadlings.avro.Rewards.Builder(other);
    }
  }

  /**
   * RecordBuilder for Rewards instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Rewards>
    implements org.apache.avro.data.RecordBuilder<Rewards> {

    private long customerId;
    private double currentPoints;
    private double total;
    private java.lang.CharSequence lastTransactionDate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yadlings.avro.Rewards.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.currentPoints)) {
        this.currentPoints = data().deepCopy(fields()[1].schema(), other.currentPoints);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.lastTransactionDate)) {
        this.lastTransactionDate = data().deepCopy(fields()[3].schema(), other.lastTransactionDate);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Rewards instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yadlings.avro.Rewards other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.currentPoints)) {
        this.currentPoints = data().deepCopy(fields()[1].schema(), other.currentPoints);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.total)) {
        this.total = data().deepCopy(fields()[2].schema(), other.total);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastTransactionDate)) {
        this.lastTransactionDate = data().deepCopy(fields()[3].schema(), other.lastTransactionDate);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public long getCustomerId() {
      return customerId;
    }


    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder setCustomerId(long value) {
      validate(fields()[0], value);
      this.customerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder clearCustomerId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'currentPoints' field.
      * @return The value.
      */
    public double getCurrentPoints() {
      return currentPoints;
    }


    /**
      * Sets the value of the 'currentPoints' field.
      * @param value The value of 'currentPoints'.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder setCurrentPoints(double value) {
      validate(fields()[1], value);
      this.currentPoints = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'currentPoints' field has been set.
      * @return True if the 'currentPoints' field has been set, false otherwise.
      */
    public boolean hasCurrentPoints() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'currentPoints' field.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder clearCurrentPoints() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'total' field.
      * @return The value.
      */
    public double getTotal() {
      return total;
    }


    /**
      * Sets the value of the 'total' field.
      * @param value The value of 'total'.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder setTotal(double value) {
      validate(fields()[2], value);
      this.total = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder clearTotal() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastTransactionDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getLastTransactionDate() {
      return lastTransactionDate;
    }


    /**
      * Sets the value of the 'lastTransactionDate' field.
      * @param value The value of 'lastTransactionDate'.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder setLastTransactionDate(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.lastTransactionDate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lastTransactionDate' field has been set.
      * @return True if the 'lastTransactionDate' field has been set, false otherwise.
      */
    public boolean hasLastTransactionDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'lastTransactionDate' field.
      * @return This builder.
      */
    public com.yadlings.avro.Rewards.Builder clearLastTransactionDate() {
      lastTransactionDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Rewards build() {
      try {
        Rewards record = new Rewards();
        record.customerId = fieldSetFlags()[0] ? this.customerId : (java.lang.Long) defaultValue(fields()[0]);
        record.currentPoints = fieldSetFlags()[1] ? this.currentPoints : (java.lang.Double) defaultValue(fields()[1]);
        record.total = fieldSetFlags()[2] ? this.total : (java.lang.Double) defaultValue(fields()[2]);
        record.lastTransactionDate = fieldSetFlags()[3] ? this.lastTransactionDate : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Rewards>
    WRITER$ = (org.apache.avro.io.DatumWriter<Rewards>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Rewards>
    READER$ = (org.apache.avro.io.DatumReader<Rewards>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.customerId);

    out.writeDouble(this.currentPoints);

    out.writeDouble(this.total);

    out.writeString(this.lastTransactionDate);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.customerId = in.readLong();

      this.currentPoints = in.readDouble();

      this.total = in.readDouble();

      this.lastTransactionDate = in.readString(this.lastTransactionDate instanceof Utf8 ? (Utf8)this.lastTransactionDate : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.customerId = in.readLong();
          break;

        case 1:
          this.currentPoints = in.readDouble();
          break;

        case 2:
          this.total = in.readDouble();
          break;

        case 3:
          this.lastTransactionDate = in.readString(this.lastTransactionDate instanceof Utf8 ? (Utf8)this.lastTransactionDate : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










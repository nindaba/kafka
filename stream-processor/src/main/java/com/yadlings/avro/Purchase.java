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
public class Purchase extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1688155581881733861L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Purchase\",\"namespace\":\"com.yadlings.avro\",\"fields\":[{\"name\":\"transactionId\",\"type\":\"long\",\"default\":0},{\"name\":\"customerId\",\"type\":\"long\",\"default\":0},{\"name\":\"card\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"employeeId\",\"type\":\"long\",\"default\":0},{\"name\":\"storeId\",\"type\":\"long\",\",default\":0},{\"name\":\"total\",\"type\":\"double\",\"default\":0},{\"name\":\"transactionDate\",\"type\":\"string\",\",default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Purchase> ENCODER =
      new BinaryMessageEncoder<Purchase>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Purchase> DECODER =
      new BinaryMessageDecoder<Purchase>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Purchase> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Purchase> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Purchase> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Purchase>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Purchase to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Purchase from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Purchase instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Purchase fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long transactionId;
   private long customerId;
   private java.lang.CharSequence card;
   private long employeeId;
   private long storeId;
   private double total;
   private java.lang.CharSequence transactionDate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Purchase() {}

  /**
   * All-args constructor.
   * @param transactionId The new value for transactionId
   * @param customerId The new value for customerId
   * @param card The new value for card
   * @param employeeId The new value for employeeId
   * @param storeId The new value for storeId
   * @param total The new value for total
   * @param transactionDate The new value for transactionDate
   */
  public Purchase(java.lang.Long transactionId, java.lang.Long customerId, java.lang.CharSequence card, java.lang.Long employeeId, java.lang.Long storeId, java.lang.Double total, java.lang.CharSequence transactionDate) {
    this.transactionId = transactionId;
    this.customerId = customerId;
    this.card = card;
    this.employeeId = employeeId;
    this.storeId = storeId;
    this.total = total;
    this.transactionDate = transactionDate;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return transactionId;
    case 1: return customerId;
    case 2: return card;
    case 3: return employeeId;
    case 4: return storeId;
    case 5: return total;
    case 6: return transactionDate;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: transactionId = (java.lang.Long)value$; break;
    case 1: customerId = (java.lang.Long)value$; break;
    case 2: card = (java.lang.CharSequence)value$; break;
    case 3: employeeId = (java.lang.Long)value$; break;
    case 4: storeId = (java.lang.Long)value$; break;
    case 5: total = (java.lang.Double)value$; break;
    case 6: transactionDate = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'transactionId' field.
   * @return The value of the 'transactionId' field.
   */
  public long getTransactionId() {
    return transactionId;
  }


  /**
   * Sets the value of the 'transactionId' field.
   * @param value the value to set.
   */
  public void setTransactionId(long value) {
    this.transactionId = value;
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
   * Gets the value of the 'card' field.
   * @return The value of the 'card' field.
   */
  public java.lang.CharSequence getCard() {
    return card;
  }


  /**
   * Sets the value of the 'card' field.
   * @param value the value to set.
   */
  public void setCard(java.lang.CharSequence value) {
    this.card = value;
  }

  /**
   * Gets the value of the 'employeeId' field.
   * @return The value of the 'employeeId' field.
   */
  public long getEmployeeId() {
    return employeeId;
  }


  /**
   * Sets the value of the 'employeeId' field.
   * @param value the value to set.
   */
  public void setEmployeeId(long value) {
    this.employeeId = value;
  }

  /**
   * Gets the value of the 'storeId' field.
   * @return The value of the 'storeId' field.
   */
  public long getStoreId() {
    return storeId;
  }


  /**
   * Sets the value of the 'storeId' field.
   * @param value the value to set.
   */
  public void setStoreId(long value) {
    this.storeId = value;
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
   * Gets the value of the 'transactionDate' field.
   * @return The value of the 'transactionDate' field.
   */
  public java.lang.CharSequence getTransactionDate() {
    return transactionDate;
  }


  /**
   * Sets the value of the 'transactionDate' field.
   * @param value the value to set.
   */
  public void setTransactionDate(java.lang.CharSequence value) {
    this.transactionDate = value;
  }

  /**
   * Creates a new Purchase RecordBuilder.
   * @return A new Purchase RecordBuilder
   */
  public static com.yadlings.avro.Purchase.Builder newBuilder() {
    return new com.yadlings.avro.Purchase.Builder();
  }

  /**
   * Creates a new Purchase RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Purchase RecordBuilder
   */
  public static com.yadlings.avro.Purchase.Builder newBuilder(com.yadlings.avro.Purchase.Builder other) {
    if (other == null) {
      return new com.yadlings.avro.Purchase.Builder();
    } else {
      return new com.yadlings.avro.Purchase.Builder(other);
    }
  }

  /**
   * Creates a new Purchase RecordBuilder by copying an existing Purchase instance.
   * @param other The existing instance to copy.
   * @return A new Purchase RecordBuilder
   */
  public static com.yadlings.avro.Purchase.Builder newBuilder(com.yadlings.avro.Purchase other) {
    if (other == null) {
      return new com.yadlings.avro.Purchase.Builder();
    } else {
      return new com.yadlings.avro.Purchase.Builder(other);
    }
  }

  /**
   * RecordBuilder for Purchase instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Purchase>
    implements org.apache.avro.data.RecordBuilder<Purchase> {

    private long transactionId;
    private long customerId;
    private java.lang.CharSequence card;
    private long employeeId;
    private long storeId;
    private double total;
    private java.lang.CharSequence transactionDate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.yadlings.avro.Purchase.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.transactionId)) {
        this.transactionId = data().deepCopy(fields()[0].schema(), other.transactionId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.card)) {
        this.card = data().deepCopy(fields()[2].schema(), other.card);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.employeeId)) {
        this.employeeId = data().deepCopy(fields()[3].schema(), other.employeeId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.storeId)) {
        this.storeId = data().deepCopy(fields()[4].schema(), other.storeId);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.total)) {
        this.total = data().deepCopy(fields()[5].schema(), other.total);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.transactionDate)) {
        this.transactionDate = data().deepCopy(fields()[6].schema(), other.transactionDate);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing Purchase instance
     * @param other The existing instance to copy.
     */
    private Builder(com.yadlings.avro.Purchase other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.transactionId)) {
        this.transactionId = data().deepCopy(fields()[0].schema(), other.transactionId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.card)) {
        this.card = data().deepCopy(fields()[2].schema(), other.card);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.employeeId)) {
        this.employeeId = data().deepCopy(fields()[3].schema(), other.employeeId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.storeId)) {
        this.storeId = data().deepCopy(fields()[4].schema(), other.storeId);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.total)) {
        this.total = data().deepCopy(fields()[5].schema(), other.total);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.transactionDate)) {
        this.transactionDate = data().deepCopy(fields()[6].schema(), other.transactionDate);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'transactionId' field.
      * @return The value.
      */
    public long getTransactionId() {
      return transactionId;
    }


    /**
      * Sets the value of the 'transactionId' field.
      * @param value The value of 'transactionId'.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder setTransactionId(long value) {
      validate(fields()[0], value);
      this.transactionId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'transactionId' field has been set.
      * @return True if the 'transactionId' field has been set, false otherwise.
      */
    public boolean hasTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'transactionId' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearTransactionId() {
      fieldSetFlags()[0] = false;
      return this;
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
    public com.yadlings.avro.Purchase.Builder setCustomerId(long value) {
      validate(fields()[1], value);
      this.customerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearCustomerId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'card' field.
      * @return The value.
      */
    public java.lang.CharSequence getCard() {
      return card;
    }


    /**
      * Sets the value of the 'card' field.
      * @param value The value of 'card'.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder setCard(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.card = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'card' field has been set.
      * @return True if the 'card' field has been set, false otherwise.
      */
    public boolean hasCard() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'card' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearCard() {
      card = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'employeeId' field.
      * @return The value.
      */
    public long getEmployeeId() {
      return employeeId;
    }


    /**
      * Sets the value of the 'employeeId' field.
      * @param value The value of 'employeeId'.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder setEmployeeId(long value) {
      validate(fields()[3], value);
      this.employeeId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'employeeId' field has been set.
      * @return True if the 'employeeId' field has been set, false otherwise.
      */
    public boolean hasEmployeeId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'employeeId' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearEmployeeId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeId' field.
      * @return The value.
      */
    public long getStoreId() {
      return storeId;
    }


    /**
      * Sets the value of the 'storeId' field.
      * @param value The value of 'storeId'.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder setStoreId(long value) {
      validate(fields()[4], value);
      this.storeId = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'storeId' field has been set.
      * @return True if the 'storeId' field has been set, false otherwise.
      */
    public boolean hasStoreId() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'storeId' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearStoreId() {
      fieldSetFlags()[4] = false;
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
    public com.yadlings.avro.Purchase.Builder setTotal(double value) {
      validate(fields()[5], value);
      this.total = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'total' field has been set.
      * @return True if the 'total' field has been set, false otherwise.
      */
    public boolean hasTotal() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'total' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearTotal() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'transactionDate' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionDate() {
      return transactionDate;
    }


    /**
      * Sets the value of the 'transactionDate' field.
      * @param value The value of 'transactionDate'.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder setTransactionDate(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.transactionDate = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'transactionDate' field has been set.
      * @return True if the 'transactionDate' field has been set, false otherwise.
      */
    public boolean hasTransactionDate() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'transactionDate' field.
      * @return This builder.
      */
    public com.yadlings.avro.Purchase.Builder clearTransactionDate() {
      transactionDate = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Purchase build() {
      try {
        Purchase record = new Purchase();
        record.transactionId = fieldSetFlags()[0] ? this.transactionId : (java.lang.Long) defaultValue(fields()[0]);
        record.customerId = fieldSetFlags()[1] ? this.customerId : (java.lang.Long) defaultValue(fields()[1]);
        record.card = fieldSetFlags()[2] ? this.card : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.employeeId = fieldSetFlags()[3] ? this.employeeId : (java.lang.Long) defaultValue(fields()[3]);
        record.storeId = fieldSetFlags()[4] ? this.storeId : (java.lang.Long) defaultValue(fields()[4]);
        record.total = fieldSetFlags()[5] ? this.total : (java.lang.Double) defaultValue(fields()[5]);
        record.transactionDate = fieldSetFlags()[6] ? this.transactionDate : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Purchase>
    WRITER$ = (org.apache.avro.io.DatumWriter<Purchase>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Purchase>
    READER$ = (org.apache.avro.io.DatumReader<Purchase>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.transactionId);

    out.writeLong(this.customerId);

    out.writeString(this.card);

    out.writeLong(this.employeeId);

    out.writeLong(this.storeId);

    out.writeDouble(this.total);

    out.writeString(this.transactionDate);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.transactionId = in.readLong();

      this.customerId = in.readLong();

      this.card = in.readString(this.card instanceof Utf8 ? (Utf8)this.card : null);

      this.employeeId = in.readLong();

      this.storeId = in.readLong();

      this.total = in.readDouble();

      this.transactionDate = in.readString(this.transactionDate instanceof Utf8 ? (Utf8)this.transactionDate : null);

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.transactionId = in.readLong();
          break;

        case 1:
          this.customerId = in.readLong();
          break;

        case 2:
          this.card = in.readString(this.card instanceof Utf8 ? (Utf8)this.card : null);
          break;

        case 3:
          this.employeeId = in.readLong();
          break;

        case 4:
          this.storeId = in.readLong();
          break;

        case 5:
          this.total = in.readDouble();
          break;

        case 6:
          this.transactionDate = in.readString(this.transactionDate instanceof Utf8 ? (Utf8)this.transactionDate : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/bigtable_instance_admin.proto

package com.google.bigtable.admin.v2;

/**
 * <pre>
 * Request message for BigtableInstanceAdmin.CreateCluster.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.CreateClusterRequest}
 */
public  final class CreateClusterRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.CreateClusterRequest)
    CreateClusterRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateClusterRequest.newBuilder() to construct.
  private CreateClusterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateClusterRequest() {
    parent_ = "";
    clusterId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateClusterRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            clusterId_ = s;
            break;
          }
          case 26: {
            com.google.bigtable.admin.v2.Cluster.Builder subBuilder = null;
            if (cluster_ != null) {
              subBuilder = cluster_.toBuilder();
            }
            cluster_ = input.readMessage(com.google.bigtable.admin.v2.Cluster.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cluster_);
              cluster_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.CreateClusterRequest.class, com.google.bigtable.admin.v2.CreateClusterRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The unique name of the instance in which to create the new cluster.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The unique name of the instance in which to create the new cluster.
   * Values are of the form
   * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object clusterId_;
  /**
   * <pre>
   * The ID to be used when referring to the new cluster within its instance,
   * e.g., just `mycluster` rather than
   * `projects/myproject/instances/myinstance/clusters/mycluster`.
   * </pre>
   *
   * <code>string cluster_id = 2;</code>
   */
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ID to be used when referring to the new cluster within its instance,
   * e.g., just `mycluster` rather than
   * `projects/myproject/instances/myinstance/clusters/mycluster`.
   * </pre>
   *
   * <code>string cluster_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_FIELD_NUMBER = 3;
  private com.google.bigtable.admin.v2.Cluster cluster_;
  /**
   * <pre>
   * The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
   */
  public boolean hasCluster() {
    return cluster_ != null;
  }
  /**
   * <pre>
   * The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
   */
  public com.google.bigtable.admin.v2.Cluster getCluster() {
    return cluster_ == null ? com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
  }
  /**
   * <pre>
   * The cluster to be created.
   * Fields marked `OutputOnly` must be left blank.
   * </pre>
   *
   * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
   */
  public com.google.bigtable.admin.v2.ClusterOrBuilder getClusterOrBuilder() {
    return getCluster();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterId_);
    }
    if (cluster_ != null) {
      output.writeMessage(3, getCluster());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!getClusterIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterId_);
    }
    if (cluster_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCluster());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.bigtable.admin.v2.CreateClusterRequest)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.CreateClusterRequest other = (com.google.bigtable.admin.v2.CreateClusterRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && getClusterId()
        .equals(other.getClusterId());
    result = result && (hasCluster() == other.hasCluster());
    if (hasCluster()) {
      result = result && getCluster()
          .equals(other.getCluster());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClusterId().hashCode();
    if (hasCluster()) {
      hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
      hash = (53 * hash) + getCluster().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.bigtable.admin.v2.CreateClusterRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.bigtable.admin.v2.CreateClusterRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for BigtableInstanceAdmin.CreateCluster.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.CreateClusterRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.CreateClusterRequest)
      com.google.bigtable.admin.v2.CreateClusterRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.CreateClusterRequest.class, com.google.bigtable.admin.v2.CreateClusterRequest.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.CreateClusterRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      clusterId_ = "";

      if (clusterBuilder_ == null) {
        cluster_ = null;
      } else {
        cluster_ = null;
        clusterBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.bigtable.admin.v2.BigtableInstanceAdminProto.internal_static_google_bigtable_admin_v2_CreateClusterRequest_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.CreateClusterRequest getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.CreateClusterRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.CreateClusterRequest build() {
      com.google.bigtable.admin.v2.CreateClusterRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.CreateClusterRequest buildPartial() {
      com.google.bigtable.admin.v2.CreateClusterRequest result = new com.google.bigtable.admin.v2.CreateClusterRequest(this);
      result.parent_ = parent_;
      result.clusterId_ = clusterId_;
      if (clusterBuilder_ == null) {
        result.cluster_ = cluster_;
      } else {
        result.cluster_ = clusterBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.CreateClusterRequest) {
        return mergeFrom((com.google.bigtable.admin.v2.CreateClusterRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.CreateClusterRequest other) {
      if (other == com.google.bigtable.admin.v2.CreateClusterRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getClusterId().isEmpty()) {
        clusterId_ = other.clusterId_;
        onChanged();
      }
      if (other.hasCluster()) {
        mergeCluster(other.getCluster());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.admin.v2.CreateClusterRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.admin.v2.CreateClusterRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The unique name of the instance in which to create the new cluster.
     * Values are of the form
     * `projects/&lt;project&gt;/instances/&lt;instance&gt;`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     * <pre>
     * The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public Builder setClusterId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public Builder clearClusterId() {
      
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ID to be used when referring to the new cluster within its instance,
     * e.g., just `mycluster` rather than
     * `projects/myproject/instances/myinstance/clusters/mycluster`.
     * </pre>
     *
     * <code>string cluster_id = 2;</code>
     */
    public Builder setClusterIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterId_ = value;
      onChanged();
      return this;
    }

    private com.google.bigtable.admin.v2.Cluster cluster_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder> clusterBuilder_;
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public boolean hasCluster() {
      return clusterBuilder_ != null || cluster_ != null;
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public com.google.bigtable.admin.v2.Cluster getCluster() {
      if (clusterBuilder_ == null) {
        return cluster_ == null ? com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
      } else {
        return clusterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public Builder setCluster(com.google.bigtable.admin.v2.Cluster value) {
      if (clusterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cluster_ = value;
        onChanged();
      } else {
        clusterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public Builder setCluster(
        com.google.bigtable.admin.v2.Cluster.Builder builderForValue) {
      if (clusterBuilder_ == null) {
        cluster_ = builderForValue.build();
        onChanged();
      } else {
        clusterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public Builder mergeCluster(com.google.bigtable.admin.v2.Cluster value) {
      if (clusterBuilder_ == null) {
        if (cluster_ != null) {
          cluster_ =
            com.google.bigtable.admin.v2.Cluster.newBuilder(cluster_).mergeFrom(value).buildPartial();
        } else {
          cluster_ = value;
        }
        onChanged();
      } else {
        clusterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public Builder clearCluster() {
      if (clusterBuilder_ == null) {
        cluster_ = null;
        onChanged();
      } else {
        cluster_ = null;
        clusterBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public com.google.bigtable.admin.v2.Cluster.Builder getClusterBuilder() {
      
      onChanged();
      return getClusterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    public com.google.bigtable.admin.v2.ClusterOrBuilder getClusterOrBuilder() {
      if (clusterBuilder_ != null) {
        return clusterBuilder_.getMessageOrBuilder();
      } else {
        return cluster_ == null ?
            com.google.bigtable.admin.v2.Cluster.getDefaultInstance() : cluster_;
      }
    }
    /**
     * <pre>
     * The cluster to be created.
     * Fields marked `OutputOnly` must be left blank.
     * </pre>
     *
     * <code>.google.bigtable.admin.v2.Cluster cluster = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder> 
        getClusterFieldBuilder() {
      if (clusterBuilder_ == null) {
        clusterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.bigtable.admin.v2.Cluster, com.google.bigtable.admin.v2.Cluster.Builder, com.google.bigtable.admin.v2.ClusterOrBuilder>(
                getCluster(),
                getParentForChildren(),
                isClean());
        cluster_ = null;
      }
      return clusterBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.CreateClusterRequest)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.CreateClusterRequest)
  private static final com.google.bigtable.admin.v2.CreateClusterRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.CreateClusterRequest();
  }

  public static com.google.bigtable.admin.v2.CreateClusterRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateClusterRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateClusterRequest>() {
    @java.lang.Override
    public CreateClusterRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateClusterRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateClusterRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateClusterRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.CreateClusterRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


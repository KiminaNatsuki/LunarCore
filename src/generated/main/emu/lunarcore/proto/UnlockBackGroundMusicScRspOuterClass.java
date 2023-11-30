// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class UnlockBackGroundMusicScRspOuterClass {
  /**
   * Protobuf type {@code UnlockBackGroundMusicScRsp}
   */
  public static final class UnlockBackGroundMusicScRsp extends ProtoMessage<UnlockBackGroundMusicScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 12;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     */
    private final RepeatedInt unlockedIds = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     */
    private final RepeatedMessage<UnlockedMusic> musicList = RepeatedMessage.newEmptyInstance(UnlockedMusic.getFactory());

    private UnlockBackGroundMusicScRsp() {
    }

    /**
     * @return a new empty instance of {@code UnlockBackGroundMusicScRsp}
     */
    public static UnlockBackGroundMusicScRsp newInstance() {
      return new UnlockBackGroundMusicScRsp();
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return this
     */
    public UnlockBackGroundMusicScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 12;</code>
     * @param value the retcode to set
     * @return this
     */
    public UnlockBackGroundMusicScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     * @return whether the unlockedIds field is set
     */
    public boolean hasUnlockedIds() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     * @return this
     */
    public UnlockBackGroundMusicScRsp clearUnlockedIds() {
      bitField0_ &= ~0x00000002;
      unlockedIds.clear();
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedIds()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUnlockedIds() {
      return unlockedIds;
    }

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUnlockedIds() {
      bitField0_ |= 0x00000002;
      return unlockedIds;
    }

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     * @param value the unlockedIds to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addUnlockedIds(final int value) {
      bitField0_ |= 0x00000002;
      unlockedIds.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_ids = 3;</code>
     * @param values the unlockedIds to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addAllUnlockedIds(final int... values) {
      bitField0_ |= 0x00000002;
      unlockedIds.addAll(values);
      return this;
    }

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     * @return whether the musicList field is set
     */
    public boolean hasMusicList() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     * @return this
     */
    public UnlockBackGroundMusicScRsp clearMusicList() {
      bitField0_ &= ~0x00000004;
      musicList.clear();
      return this;
    }

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMusicList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<UnlockedMusic> getMusicList() {
      return musicList;
    }

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<UnlockedMusic> getMutableMusicList() {
      bitField0_ |= 0x00000004;
      return musicList;
    }

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     * @param value the musicList to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addMusicList(final UnlockedMusic value) {
      bitField0_ |= 0x00000004;
      musicList.add(value);
      return this;
    }

    /**
     * <code>repeated .UnlockBackGroundMusicScRsp.UnlockedMusic music_list = 6;</code>
     * @param values the musicList to add
     * @return this
     */
    public UnlockBackGroundMusicScRsp addAllMusicList(final UnlockedMusic... values) {
      bitField0_ |= 0x00000004;
      musicList.addAll(values);
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp copyFrom(final UnlockBackGroundMusicScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        unlockedIds.copyFrom(other.unlockedIds);
        musicList.copyFrom(other.musicList);
      }
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp mergeFrom(final UnlockBackGroundMusicScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasUnlockedIds()) {
        getMutableUnlockedIds().addAll(other.unlockedIds);
      }
      if (other.hasMusicList()) {
        getMutableMusicList().addAll(other.musicList);
      }
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      unlockedIds.clear();
      musicList.clear();
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockedIds.clear();
      musicList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof UnlockBackGroundMusicScRsp)) {
        return false;
      }
      UnlockBackGroundMusicScRsp other = (UnlockBackGroundMusicScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasUnlockedIds() || unlockedIds.equals(other.unlockedIds))
        && (!hasMusicList() || musicList.equals(other.musicList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < unlockedIds.length(); i++) {
          output.writeRawByte((byte) 24);
          output.writeUInt32NoTag(unlockedIds.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000004) != 0) {
        for (int i = 0; i < musicList.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(musicList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * unlockedIds.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(unlockedIds);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += (1 * musicList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(musicList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public UnlockBackGroundMusicScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 96: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // unlockedIds [packed=true]
            input.readPackedUInt32(unlockedIds, tag);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // musicList
            tag = input.readRepeatedMessage(musicList, tag);
            bitField0_ |= 0x00000004;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 24: {
            // unlockedIds [packed=false]
            tag = input.readRepeatedUInt32(unlockedIds, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.unlockedIds, unlockedIds);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRepeatedMessage(FieldNames.musicList, musicList);
      }
      output.endObject();
    }

    @Override
    public UnlockBackGroundMusicScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -856496939:
          case -780941476: {
            if (input.isAtField(FieldNames.unlockedIds)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(unlockedIds);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 389904483:
          case -780236168: {
            if (input.isAtField(FieldNames.musicList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(musicList);
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public UnlockBackGroundMusicScRsp clone() {
      return new UnlockBackGroundMusicScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static UnlockBackGroundMusicScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new UnlockBackGroundMusicScRsp(), data).checkInitialized();
    }

    public static UnlockBackGroundMusicScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockBackGroundMusicScRsp(), input).checkInitialized();
    }

    public static UnlockBackGroundMusicScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new UnlockBackGroundMusicScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating UnlockBackGroundMusicScRsp messages
     */
    public static MessageFactory<UnlockBackGroundMusicScRsp> getFactory() {
      return UnlockBackGroundMusicScRspFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code UnlockedMusic}
     */
    public static final class UnlockedMusic extends ProtoMessage<UnlockedMusic> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 group_id = 1;</code>
       */
      private int groupId;

      /**
       * <code>optional uint32 id = 8;</code>
       */
      private int id;

      /**
       * <code>optional bool unkbool = 7;</code>
       */
      private boolean unkbool;

      private UnlockedMusic() {
      }

      /**
       * @return a new empty instance of {@code UnlockedMusic}
       */
      public static UnlockedMusic newInstance() {
        return new UnlockedMusic();
      }

      /**
       * <code>optional uint32 group_id = 1;</code>
       * @return whether the groupId field is set
       */
      public boolean hasGroupId() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 group_id = 1;</code>
       * @return this
       */
      public UnlockedMusic clearGroupId() {
        bitField0_ &= ~0x00000001;
        groupId = 0;
        return this;
      }

      /**
       * <code>optional uint32 group_id = 1;</code>
       * @return the groupId
       */
      public int getGroupId() {
        return groupId;
      }

      /**
       * <code>optional uint32 group_id = 1;</code>
       * @param value the groupId to set
       * @return this
       */
      public UnlockedMusic setGroupId(final int value) {
        bitField0_ |= 0x00000001;
        groupId = value;
        return this;
      }

      /**
       * <code>optional uint32 id = 8;</code>
       * @return whether the id field is set
       */
      public boolean hasId() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 id = 8;</code>
       * @return this
       */
      public UnlockedMusic clearId() {
        bitField0_ &= ~0x00000002;
        id = 0;
        return this;
      }

      /**
       * <code>optional uint32 id = 8;</code>
       * @return the id
       */
      public int getId() {
        return id;
      }

      /**
       * <code>optional uint32 id = 8;</code>
       * @param value the id to set
       * @return this
       */
      public UnlockedMusic setId(final int value) {
        bitField0_ |= 0x00000002;
        id = value;
        return this;
      }

      /**
       * <code>optional bool unkbool = 7;</code>
       * @return whether the unkbool field is set
       */
      public boolean hasUnkbool() {
        return (bitField0_ & 0x00000004) != 0;
      }

      /**
       * <code>optional bool unkbool = 7;</code>
       * @return this
       */
      public UnlockedMusic clearUnkbool() {
        bitField0_ &= ~0x00000004;
        unkbool = false;
        return this;
      }

      /**
       * <code>optional bool unkbool = 7;</code>
       * @return the unkbool
       */
      public boolean getUnkbool() {
        return unkbool;
      }

      /**
       * <code>optional bool unkbool = 7;</code>
       * @param value the unkbool to set
       * @return this
       */
      public UnlockedMusic setUnkbool(final boolean value) {
        bitField0_ |= 0x00000004;
        unkbool = value;
        return this;
      }

      @Override
      public UnlockedMusic copyFrom(final UnlockedMusic other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          groupId = other.groupId;
          id = other.id;
          unkbool = other.unkbool;
        }
        return this;
      }

      @Override
      public UnlockedMusic mergeFrom(final UnlockedMusic other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasGroupId()) {
          setGroupId(other.groupId);
        }
        if (other.hasId()) {
          setId(other.id);
        }
        if (other.hasUnkbool()) {
          setUnkbool(other.unkbool);
        }
        return this;
      }

      @Override
      public UnlockedMusic clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        groupId = 0;
        id = 0;
        unkbool = false;
        return this;
      }

      @Override
      public UnlockedMusic clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof UnlockedMusic)) {
          return false;
        }
        UnlockedMusic other = (UnlockedMusic) o;
        return bitField0_ == other.bitField0_
          && (!hasGroupId() || groupId == other.groupId)
          && (!hasId() || id == other.id)
          && (!hasUnkbool() || unkbool == other.unkbool);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(groupId);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 64);
          output.writeUInt32NoTag(id);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          output.writeRawByte((byte) 56);
          output.writeBoolNoTag(unkbool);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          size += 2;
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public UnlockedMusic mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // groupId
              groupId = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 64) {
                break;
              }
            }
            case 64: {
              // id
              id = input.readUInt32();
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 56) {
                break;
              }
            }
            case 56: {
              // unkbool
              unkbool = input.readBool();
              bitField0_ |= 0x00000004;
              tag = input.readTag();
              if (tag != 0) {
                break;
              }
            }
            case 0: {
              return this;
            }
            default: {
              if (!input.skipField(tag)) {
                return this;
              }
              tag = input.readTag();
              break;
            }
          }
        }
      }

      @Override
      public void writeTo(final JsonSink output) throws IOException {
        output.beginObject();
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeUInt32(FieldNames.groupId, groupId);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.id, id);
        }
        if ((bitField0_ & 0x00000004) != 0) {
          output.writeBool(FieldNames.unkbool, unkbool);
        }
        output.endObject();
      }

      @Override
      public UnlockedMusic mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 293428218:
            case 506361563: {
              if (input.isAtField(FieldNames.groupId)) {
                if (!input.trySkipNullValue()) {
                  groupId = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 3355: {
              if (input.isAtField(FieldNames.id)) {
                if (!input.trySkipNullValue()) {
                  id = input.readUInt32();
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case -285198628: {
              if (input.isAtField(FieldNames.unkbool)) {
                if (!input.trySkipNullValue()) {
                  unkbool = input.readBool();
                  bitField0_ |= 0x00000004;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            default: {
              input.skipUnknownField();
              break;
            }
          }
        }
        input.endObject();
        return this;
      }

      @Override
      public UnlockedMusic clone() {
        return new UnlockedMusic().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static UnlockedMusic parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new UnlockedMusic(), data).checkInitialized();
      }

      public static UnlockedMusic parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new UnlockedMusic(), input).checkInitialized();
      }

      public static UnlockedMusic parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new UnlockedMusic(), input).checkInitialized();
      }

      /**
       * @return factory for creating UnlockedMusic messages
       */
      public static MessageFactory<UnlockedMusic> getFactory() {
        return UnlockedMusicFactory.INSTANCE;
      }

      private enum UnlockedMusicFactory implements MessageFactory<UnlockedMusic> {
        INSTANCE;

        @Override
        public UnlockedMusic create() {
          return UnlockedMusic.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName groupId = FieldName.forField("groupId", "group_id");

        static final FieldName id = FieldName.forField("id");

        static final FieldName unkbool = FieldName.forField("unkbool");
      }
    }

    private enum UnlockBackGroundMusicScRspFactory implements MessageFactory<UnlockBackGroundMusicScRsp> {
      INSTANCE;

      @Override
      public UnlockBackGroundMusicScRsp create() {
        return UnlockBackGroundMusicScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName unlockedIds = FieldName.forField("unlockedIds", "unlocked_ids");

      static final FieldName musicList = FieldName.forField("musicList", "music_list");
    }
  }
}